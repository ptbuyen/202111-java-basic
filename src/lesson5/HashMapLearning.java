package lesson5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {

    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "Police");
        emergencyList.put(114, "Fire Dept");
        emergencyList.put(115, "Hospital");
        emergencyList.put(116, "Others");
        emergencyList.put(117, "Others");
        emergencyList.put(null, "This is a null one");
        emergencyList.put(null, "New one"); // Map not allow duplicate key

        // CRUD
        System.out.println(emergencyList.get(113)); // return value
        System.out.println(emergencyList.get(118)); // return "null" if key not exist

        // Update
        System.out.println("=====");
        emergencyList.replace(null, "NULL");
        emergencyList.replace(null, "New one", "NULLLLLLL");

        // Remove
        emergencyList.remove(null, "null");
        emergencyList.remove(null);
        System.out.println(emergencyList.get(null));

        System.out.println("=====");
        Set<Integer> keySet = emergencyList.keySet(); // get value list of map
        for (Integer key : keySet) {
            System.out.println(key);
        }

        System.out.println("=====");
        for (Integer key : keySet) {
            System.out.println(emergencyList.get(key));
        }

        // Remove with key has Others value
//        for (Integer key : emergencyList.keySet()) {
//            emergencyList.remove(key);
//            break;
//        }

        System.out.println("=====");

        Iterator<Map.Entry<Integer, String>> emergencyListIterator = emergencyList.entrySet().iterator();
        while (emergencyListIterator.hasNext()){
            Map.Entry<Integer, String> entry = emergencyListIterator.next();
            String entryValue = entry.getValue();
            if (entryValue.equals("Others"))
                emergencyListIterator.remove();
        }

        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }

    }
}
