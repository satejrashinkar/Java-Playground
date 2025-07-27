package collectionframework;

import java.util.concurrent.ConcurrentSkipListMap;

public class Prog18_ConcurrentSkipListMap {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String,Integer> map = new ConcurrentSkipListMap<>();
        map.put("Apple",10);
        map.put("Banana",20);
        map.put("Orange",30);
        System.out.println(map);
    }
}
