package lesson5;

import java.util.*;

public class ArrayListLearning {

    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);

        // get 2 min number value

        /*
        * Remove duplicate
        * subList
        * */

        Set<Integer> set = new HashSet<>(myArrList); // set --> remove duplicate
        List<Integer> withoutDuplicate = new ArrayList<>(set);

        // Sort
//        Collections.sort(withoutDuplicate); // default ascending
        Collections.sort(withoutDuplicate, Collections.reverseOrder()); // descending

        for (Integer integer : withoutDuplicate) {
            System.out.println(integer);
        }

        // Sublist
        List<Integer> targetArrList = withoutDuplicate.subList(0, 2);

        for (Integer integer : targetArrList) {
            System.out.println(integer);
        }
    }
}
