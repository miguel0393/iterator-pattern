package applications.itearator_pattern;

import applications.itearator_pattern.my_array.MyArray;
import applications.itearator_pattern.my_list.MyList;

public class MainClass {

    public static void main(String[] args) {

        final Object[] elements = {"1", 2, "3", 4, "5", 6};
        final MyIterator<Object> myArray = new MyArray<>(elements);

        final MyIterator<Integer> myList = new MyList<>(2, 4, 6);

        MyApplication<Object, Integer> application = new MyApplication<>(myArray, myList);
        application.printMyIterators();
    }
}
