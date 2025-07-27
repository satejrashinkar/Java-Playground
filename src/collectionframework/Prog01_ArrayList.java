package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prog01_ArrayList {
    public static void printArrayV1(ArrayList<Integer> arr) {
        System.out.println("Printing list elements : ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void printArrayV2(ArrayList<Integer> list) {
        System.out.println("Printing list elements : ");
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("ArrayList Demo");
        ArrayList<Integer> list = new ArrayList<>(1000);
        list.add(10);
        list.add(25);
        list.add(150);
        list.add(75);

        System.out.println("Printing element at index 2 : " + list.get(2));
        System.out.println("Size of list : " + list.size());

        printArrayV2(list);
        System.out.println("Contains 25 : " + list.contains(25));
        System.out.println("Contains 125 : " + list.contains(425));

        list.remove(2);
        printArrayV2(list);

        System.out.println("Adding an element at specific index");
        list.add(2, 500);
        printArrayV2(list);

        System.out.println("Updating an element at specific index");
        list.set(2, 400);
        System.out.println(list);

        // Creation
        List<String> list1 = new ArrayList<>();
        List<String> list2 = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        List<String> weekDays = new ArrayList<>(list2);
        weekDays.add("Sunday");
        System.out.println("weekDays : " + weekDays);
//        list2.add("Sunday");      UnsupportedOperationException - asList returns a fixed size list
        list2.set(5, "Sunday");

        String[] fruits = {"Apple", "Apple", "Mango", "Banana", "Cherry"};
        List<String> list3 = Arrays.asList(fruits);
        List<String> fruitsList = new ArrayList<>(List.of(fruits));
        fruitsList.remove("Apple");
        System.out.println("fruitsList: " + fruitsList);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        List<Integer> integerList = List.of(5, 6, 7, 8, 9, 10);
        System.out.println(integerList);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.addAll(integerList);
        System.out.println("Numbers : " + numbers);

        // Remove
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);

        System.out.println("numberList : " + numberList);
        numberList.remove(Integer.valueOf(1));
        System.out.println("numberList : " + numberList);
        Integer[] intArray = numberList.toArray(new Integer[0]);

        List<Integer> list4 = new ArrayList<>();
        list4.add(5);
        list4.add(4);
        list4.add(3);
        list4.add(2);
        list4.add(1);
        System.out.println("Before sort : " + list4);
//        Collections.sort(list4);
        list4.sort(null);
        System.out.println("After sort : " + list4);

    }
}
