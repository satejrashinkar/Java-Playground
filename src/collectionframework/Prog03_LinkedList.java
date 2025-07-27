package collectionframework;

import java.util.Arrays;
import java.util.LinkedList;

public class Prog03_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.addFirst(0);
        linkedList.addLast(5);

        System.out.println(linkedList);
        System.out.println(linkedList.get(2));

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        linkedList.removeFirst();
        linkedList.remove(3);
        System.out.println(linkedList);

        linkedList.removeIf(x -> (x & 1) == 0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat", "dog", "tiger", "elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("cat", "dog", "lion"));
        System.out.println(animals);
        animals.removeAll(animalsToRemove);
        System.out.println(animals);

    }
}
