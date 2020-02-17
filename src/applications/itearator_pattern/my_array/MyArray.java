package applications.itearator_pattern.my_array;

import applications.itearator_pattern.MyCollection;

import java.util.Iterator;

public class MyArray<T> implements MyCollection<T> {

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

}
