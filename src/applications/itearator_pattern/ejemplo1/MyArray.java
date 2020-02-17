package applications.itearator_pattern.ejemplo1;

import applications.itearator_pattern.MyIterator;

import java.util.Collection;
import java.util.Iterator;

public class MyArray<T> implements MyIterator<T> {

    private final T[] elements;
    private int cursor;

    public MyArray(T[] elements) {
        this.elements = elements;
        this.cursor = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            @Override
            public boolean hasNext() {
                return MyArray.this.cursor < MyArray.this.elements.length;
            }

            @Override
            public T next() {
                final int index = MyArray.this.cursor;
                final T next = MyArray.this.elements[index];
                MyArray.this.cursor += 2;

                return next;
            }
        };
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        this.elements = c;
        return false;
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

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
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

}
