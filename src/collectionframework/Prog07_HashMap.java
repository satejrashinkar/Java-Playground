package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prog07_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(35, "Sam");
        hashMap.put(1, "Alex");
        hashMap.put(4, "Peter");
        hashMap.put(23, "Bhaskar");
        System.out.println(hashMap);

        System.out.println(hashMap.get(2));
        System.out.println(hashMap.get(100));
        System.out.println(hashMap.containsKey(3));
        System.out.println(hashMap.containsValue("Peter"));

//        Set<Integer> keys = hashMap.keySet();
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key));
        }

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for (Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(hashMap);

//        hashMap.remove(4);
        boolean result = hashMap.remove(4, "Nitin");
        System.out.println(result);
        System.out.println(hashMap);

        System.out.println(hashMap.getOrDefault(23,"Default String"));
        System.out.println(hashMap.putIfAbsent(23,"AKSHIT"));
        System.out.println(hashMap);

    }
}
