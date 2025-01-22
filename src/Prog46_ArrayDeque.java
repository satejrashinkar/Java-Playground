import java.util.ArrayDeque;

public class Prog46_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);

        dq.addFirst(5);
        dq.addLast(50);

        System.out.println("getFirst() : " + dq.getFirst());
        System.out.println("getLast() : " + dq.getLast());
    }
}
