package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Prog14_Comparable {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice",3.5));
        list.add(new Student("Bob",3.7));
        list.add(new Student("Peter",3.9));
        list.add(new Student("Sam",3.6));
        list.sort(null);
        System.out.println(list);
    }
}
