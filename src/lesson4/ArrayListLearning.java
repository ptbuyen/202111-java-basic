package lesson4;

import lesson2.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {

    // collection list map set
    public static void main(String[] args) {

        // Declaration
        List<Integer> myArrList = new ArrayList<>();

        // CRUD
        //  Add
        myArrList.add(1); // Index 0
        myArrList.add(2); // Index 1
        myArrList.add(4); // Index 2

        //  Read - Get
//        System.out.println(myArrList.get(1));

        // ArrayList size
//        System.out.println(myArrList.size());

        myArrList.add(2, 3); // insert into index 2 the value 3

        myArrList.set(myArrList.size() - 1, 100);

        // Delete
        myArrList.remove(myArrList.size() - 1);

        for (int elementIndex = 0; elementIndex < myArrList.size(); elementIndex++) {
            System.out.println(myArrList.get(elementIndex));
        }

        List<Integer> myArrList1 = Arrays.asList(1, 2, 3); // fixed size, can NOT update or remove
        List<Integer> myArrList2 = new ArrayList<>(Arrays.asList(1, 2, 3)); // can update or remove
    }
}
