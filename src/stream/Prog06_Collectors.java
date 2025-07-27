package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Prog06_Collectors {
    public static void main(String[] args) {
        // 1. collecting to a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> list = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(list);

        // 2. collecting to a set
        List<Integer> nums = Arrays.asList(1, 1, 2, 3, 4, 2, 3, 5, 7, 5, 9);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        // 3. collecting to a specified collection
        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        // 4. joining strings
        String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);

        // 5. summarizing data
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics collect1 = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(collect1);

        // 6. calculating average
        Double average = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(average);

        // 7. count of elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println(count);

        // 8. grouping elements
        List<String> words = Arrays.asList("hello", "world", "java", "streams", "collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        TreeMap<Integer, Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println("treeMap : " + treeMap);

        // 9. partitioning elements
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));

        // 10. mapping and collecting
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));
    }
}
