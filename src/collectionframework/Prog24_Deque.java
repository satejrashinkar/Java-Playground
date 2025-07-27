package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Prog24_Deque {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        System.out.println(deque1); // 5,10,20,25

        System.out.println(deque1.getFirst());
        System.out.println(deque1.getLast());
        System.out.println(deque1.peekFirst()); // Retrieves, but does not remove, the first element of deque, returns null if deque is empty.
        System.out.println(deque1.pollFirst()); // Retrieves and removes the first element of deque
        System.out.println(deque1);

        Deque<Integer> deque2 = new LinkedList<>();
    }
}
