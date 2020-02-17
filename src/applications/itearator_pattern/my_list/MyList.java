package applications.itearator_pattern.my_list;

import applications.itearator_pattern.MyCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static java.util.Objects.isNull;

public class MyList<T> implements MyCollection<T> {

    private MyElement<T> first;
    private MyElement<T> last;
    private int size;

    @SafeVarargs
    public MyList(final T... values) {
        this.size = -1;
        addAll(values);
    }

    private void addAll(T... values) {
        for (T value : values) {
            final MyElement<T> newElement = new MyElement<>();
            newElement.setValue(value);

            if (isNull(this.first)) {
                this.first = newElement;
            } else {
                this.last.setNext(newElement);
            }

            this.last = newElement;
            this.size++;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private MyElement<T> current;
            private int index = -1;

            @Override
            public boolean hasNext() {
                return this.index < MyList.this.size;
            }

            @Override
            public T next() {
                MyElement<T> next;

                if (isNull(this.current)) {
                    next = MyList.this.first;
                } else {
                    next = this.current.getNext();
                }

                this.current = next;
                this.index++;
                return next.getValue();
            }
        };
    }

}
