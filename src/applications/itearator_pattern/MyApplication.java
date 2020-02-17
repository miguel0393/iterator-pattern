package applications.itearator_pattern;

public class MyApplication<T1, T2> {

    private final MyIterator<T1> myArray;
    private final MyIterator<T2> myList;

    public MyApplication(MyIterator<T1> myArray, MyIterator<T2> myList) {
        this.myArray = myArray;
        this.myList = myList;
    }

    public void printMyIterators() {
        System.out.println("*********Array:*********\n");
        print(this.myArray);

        System.out.println("*********List:*********\n");
        print(this.myList);
    }

    private <T> void print(MyIterator<T> iterable) {
        iterable.forEach(System.out::println);
    }
}
