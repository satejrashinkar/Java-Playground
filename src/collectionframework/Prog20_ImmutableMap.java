package collectionframework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Prog20_ImmutableMap {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        System.out.println(map1);

        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
//        map2.put("C",3); UnsupportedOperationException

        Map<String, Integer> map3 = Map.of("Alice", 90, "Bob", 95, "Peter", 89);
//        map3.put("Anil",94); UnsupportedOperationException

        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Akshit", 90), Map.entry("Shubham", 95), Map.entry("Peter", 92));
        System.out.println(map4);
    }
}
