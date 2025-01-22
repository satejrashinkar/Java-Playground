import java.util.HashSet;

public class Prog47_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        // HashSet<Integer> hashSet1 = new HashSet<>(10,0.5f);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(40);
        hashSet.add(10);
        System.out.println(hashSet);

        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.contains(10));
    }
}
