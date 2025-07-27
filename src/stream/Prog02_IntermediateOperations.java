package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Prog02_IntermediateOperations {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ram", "Shyam", "Anil", "Peter", "Akshit", "Shyam");

        // 1. filter
        long a = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(a);

        // 2. map
        list.stream().map(String::toUpperCase);

        // 3. sorted
        Stream<String> sorted = list.stream().sorted();
        Stream<String> sorted1 = list.stream().sorted((s1, s2) -> s1.length() - s2.length());

        // 4. distinct
        System.out.println(list.stream().filter(x -> x.toLowerCase().startsWith("s")).count());
        System.out.println(list.stream().filter(x -> x.toLowerCase().startsWith("s")).distinct().count());

        // 5. limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());

        // 6. skip
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100).count());

        // 7. peek
        Stream.iterate(1, x -> x + 1).skip(10).limit(10).peek(System.out::println).count();

        // 8. flatMap
        List<List<String>> listsOfLists = Arrays.asList(Arrays.asList("apple", "banana"), Arrays.asList("orange", "kiwi"), Arrays.asList("pear", "guava"));
        System.out.println(listsOfLists.get(1).get(1));
        System.out.println(listsOfLists.stream().flatMap(x -> x.stream()).toList());
        System.out.println(listsOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());
    }
}
