package collectionframework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Prog22_Queue {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println("Queue Operations : ");

        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        System.out.println(queue1);
        queue1.remove();
        System.out.println(queue1);
        queue1.remove();

        System.out.println(queue1.remove());    // Throws exception if empty
        System.out.println(queue1.poll());
        System.out.println(queue1);
        queue1.add(10);
        System.out.println(queue1.element());   // Throws exception if empty
        System.out.println(queue1.peek());

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        queue2.add(1);
        queue2.offer(2);
        System.out.println(queue2.offer(3));
        System.out.println(queue2);
    }
}
