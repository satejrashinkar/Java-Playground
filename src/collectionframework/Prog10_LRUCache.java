package collectionframework;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}

public class Prog10_LRUCache {
    public static void main(String[] args) {
        LRUCache<String,Integer> studentMap = new LRUCache<>(3);
        studentMap.put("Bob",80);
        studentMap.put("Alice",90);
        studentMap.put("Ram",85);
        studentMap.get("Bob");
        System.out.println(studentMap);
        studentMap.put("Ashish",78);

        System.out.println(studentMap);
    }
}
