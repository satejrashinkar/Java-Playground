import java.util.ArrayList;

public class Prog44_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(5);
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
