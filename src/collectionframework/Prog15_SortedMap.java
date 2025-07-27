package collectionframework;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Prog15_SortedMap {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);
        map.put(95, "Alice");
        map.put(91, "Vivek");
        map.put(75, "Peter");
        map.put(82, "Bhaskar");
        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(91));
        System.out.println(map.tailMap(82));
        System.out.println(map.subMap(95, 70));

        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(5, "Five");
        navigableMap.put(3, "Three");
        navigableMap.put(1, "One");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerEntry(4));
        System.out.println(navigableMap.ceilingEntry(5));
        System.out.println(navigableMap.higherEntry(1));
        System.out.println(navigableMap.descendingMap());
    }
}
