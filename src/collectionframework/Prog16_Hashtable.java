package collectionframework;

import java.util.Hashtable;

public class Prog16_Hashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"Apple");
        hashtable.put(2,"Banana");
        hashtable.put(3,"Orange");
        System.out.println(hashtable);
        System.out.println(hashtable.get(3));
        System.out.println(hashtable.containsKey(2));

        // Exception - no null key or null value allowed
//        hashtable.put(null,"Test");
//        hashtable.put(5,null);

    }
}
