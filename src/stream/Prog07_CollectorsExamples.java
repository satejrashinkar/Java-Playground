package stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Prog07_CollectorsExamples {
    public static void main(String[] args) {
        // 1. collecting names by length
        List<String> names = Arrays.asList("Alice", "Bob", "Peter", "Charlie", "Alexander");
        System.out.println(names.stream().collect(Collectors.groupingBy(String::length)));

        // 2. counting word occurances
        String sentence = "hello world hello java world streams";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // 3. partitioning even and odd numbers
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(nums.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));

        // 4. sum of values in a map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Orange", 25);
        items.put("Banana", 15);
        System.out.println(items.values().stream().reduce(Integer::sum).get());
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        // 5. creating a map from stream elements
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        Map<String, Integer> collect = fruits.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
        System.out.println(collect);

        // 6. count of words
        List<String> fruits2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(fruits2.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())));
        System.out.println(fruits2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)));
    }
}
