package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Prog01_StreamIntroduction {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("List : " + integerList);
        System.out.println("Count of even elements : " + integerList.stream().filter(num -> num % 2 == 0).count());

        // Creating streams
        // 1. From Collections
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        Stream<Integer> stream = numbers.stream();

        // 2. From Arrays
        String[] names = {"A", "B", "C"};
        Stream<String> stream1 = Arrays.stream(names);

        // 3. Stream.of()
        Stream<String> stream2 = Stream.of("a", "b", "c");

        // 4. Infinite Stream - limited to 100 size
        Stream<Integer> stream3 = Stream.generate(() -> 1).limit(100);
        Stream<Integer> stream4 = Stream.iterate(1, x -> x + 1).limit(100);
    }
}
