package applications.itearator_pattern.my_list;

public class MyElement<T> {

    private T value;
    private MyElement<T> next;


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public MyElement<T> getNext() {
        return next;
    }

    public void setNext(MyElement<T> next) {
        this.next = next;
    }
}
