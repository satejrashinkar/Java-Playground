package collectionframework;

import java.util.Arrays;
import java.util.Vector;

public class Prog04_Vector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5, 3);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println(vector);
        System.out.println(vector.capacity());
        vector.add(6);
        System.out.println(vector);
        System.out.println(vector.capacity());

        Vector<Integer> numbers = new Vector<>(Arrays.asList(2, 4, 6, 8, 10));
        System.out.println(numbers);
    }
}
