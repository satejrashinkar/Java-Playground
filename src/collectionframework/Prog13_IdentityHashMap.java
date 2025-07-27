package collectionframework;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Prog13_IdentityHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new IdentityHashMap<>();
        String key1 = new String("key");
        String key2 = new String("key");
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);
    }
}
