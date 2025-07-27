package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Prog06_CopyOnWriteArrayList {
    public static void main(String[] args) {
        // read intensive use cases
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        List<String> shoppingList = new CopyOnWriteArrayList<>(Arrays.asList("milk", "eggs", "bread"));
        System.out.println("Initial shoppingList : " + shoppingList);
        for (String item : shoppingList) {
            System.out.println(item);
            if (item.equals("eggs")) {
                shoppingList.add("butter"); // ConcurrentModificationException for ArrayList
                System.out.println("Added butter while reading elements from shoppingList");
            }
        }
        System.out.println("updated shoppingList : " + shoppingList);
    }
}
