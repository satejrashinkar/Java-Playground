package collectionframework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Prog23_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);  //does not allow null elements
        pq.add(100);
        pq.add(2);
        pq.add(57);
        pq.add(85);

        while (!pq.isEmpty()) {
            System.out.println("Element removed is : " + pq.poll());
        }
    }
}
