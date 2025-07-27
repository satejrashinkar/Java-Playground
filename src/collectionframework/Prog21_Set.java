package collectionframework;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class Prog21_Set {
    public static void main(String[] args) {
        Set<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(4);
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(1);
        System.out.println(integerSet);

        System.out.println("Size : " + integerSet.size());
        System.out.println(integerSet.contains(4));
        integerSet.remove(1);
        System.out.println(integerSet);
        System.out.println(integerSet.isEmpty());

//        Set<Integer> synchronizedSet = Collections.synchronizedSet(integerSet);
//        System.out.println(synchronizedSet);

        Set<Integer> set = new ConcurrentSkipListSet<>();
    }
}
