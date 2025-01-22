import java.util.ArrayList;
import java.util.LinkedList;

public class Prog45_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(2,25);
        list1.add(2,26);
        list1.addAll(list2);
        list1.addAll(0,list2);

        // Methods addFirst and addLast present in LinkedList only and not in ArrayList
        list1.addFirst(1000);
        list1.addLast(1000);

        // list1.clear();

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        System.out.println("Contains : " + list1.contains(20));
        System.out.println("Index of : " + list1.indexOf(20));
        System.out.println("Index of : " + list1.indexOf(400));
        System.out.println("Index of : " + list1.lastIndexOf(400));
        list1.set(1,250);
        System.out.println("After set operation : ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
    }
}
