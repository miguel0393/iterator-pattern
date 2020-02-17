package applications.itearator_pattern.my_list;

import applications.itearator_pattern.MyIterator;

import java.util.Iterator;

import static java.util.Objects.isNull;

public class MyList<T> implements MyIterator<T> {

    private MyElement<T> first;
    private MyElement<T> last;
    private int size;

    public MyList(T... values) {
        this.size = -1;
        addAll(values);
    }

    @SafeVarargs
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
        return new Iterator<>() {

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
                    this.current = next;
                } else {
                    next = this.current.getNext();
                }

                this.index++;
                return next.getValue();
            }
        };
    }

}
