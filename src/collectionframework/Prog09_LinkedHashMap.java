package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Prog09_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(15,0.5f,true);   // uses DLL
        // order of insertion of elements is maintained in LinkedHashMap unlike HashMap
        linkedHashMap.put("Orange", 30);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 10);
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
