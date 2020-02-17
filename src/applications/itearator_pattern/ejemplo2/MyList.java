package applications.itearator_pattern.ejemplo2;

import applications.itearator_pattern.MyIterator;

import java.util.Collection;
import java.util.Iterator;

import static java.util.Objects.isNull;

public class MyList<T> implements MyIterator<T> {

    private MyElement<T> first;
    private MyElement<T> last;
    private int size;

    public MyList() {
        this.size = -1;
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
                    this.current = next;
                } else {
                    next = this.current.getNext();
                }

                this.index++;
                return next.getValue();
            }
        };
    }

    @Override
    public boolean add(T value) {
        final MyElement<T> newElement = new MyElement<T>();
        newElement.setValue(value);

        if (isNull(this.first)) {
            this.first = newElement;
        } else {
            this.last.setNext(newElement);
        }

        this.last = newElement;
        this.size++;

        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

}
