package collectionframework;

import java.util.concurrent.ConcurrentHashMap;

public class Prog17_ConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Peter", 85);
        map.put("Sam", 80);
        map.put("Anil", 97);
        System.out.println(map);
        System.out.println(map.get("Sam"));
    }
}
