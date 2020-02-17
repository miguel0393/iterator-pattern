package applications.itearator_pattern;

import applications.itearator_pattern.ejemplo1.MyArray;
import applications.itearator_pattern.ejemplo2.MyList;

public class MainClass {

    public static void main(String[] args) {
//        ejemplo1();
        ejemplo2();
    }

    private static void ejemplo1() {
        System.out.println("*********Ejemplo 1:*********\n");

        final Object[] elements = {"1", 2, "3", 4, "5", 6};

        final MyIterator<Object> myArray = new MyArray<>(elements);
        show(myArray);
    }

    private static void ejemplo2() {
        System.out.println("\n*********Ejemplo 2:*********\n");

        MyIterator<Integer> myList = new MyList<>();

        myList.add(2);
        myList.add(4);
        myList.add(6);

        show(myList);
    }

    private static <T> void show(MyIterator<T> myIterator) {
        myIterator.forEach(System.out::println);
    }
}
