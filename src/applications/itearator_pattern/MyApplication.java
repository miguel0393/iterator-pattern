package applications.itearator_pattern;

public class MyApplication<T1, T2> {

    private final MyCollection<T1> myArray;
    private final MyCollection<T2> myList;

    public MyApplication(MyCollection<T1> myArray, MyCollection<T2> myList) {
        this.myArray = myArray;
        this.myList = myList;
    }

    public void printMyIterators() {
        System.out.println("*********Array:*********\n");
        print(this.myArray);

        System.out.println("*********List:*********\n");
        print(this.myList);
    }

    private <T> void print(MyCollection<T> iterable) {
        iterable.forEach(System.out::println);
    }
}
