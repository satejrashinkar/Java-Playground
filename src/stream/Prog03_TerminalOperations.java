package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prog03_TerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. foreach
        list.stream().forEach(x -> System.out.println(x));

        // 3. reduce
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        // 4. anyMatch, allMatch, noneMatch
        boolean anyMatch = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(anyMatch);

        boolean allMatch = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(allMatch);

        boolean noneMatch = list.stream().noneMatch(x -> x < 0);
        System.out.println(noneMatch);

        // 5. findFirst, findAny
        Optional<Integer> first = list.stream().findFirst();
        System.out.println(first.get());
        Optional<Integer> any = list.stream().findAny();
        System.out.println(any.get());

        // 6. toArray
        Object[] array = Stream.of(1, 2, 3, 4, 5).toArray();

        // 7. min / max
        System.out.println(Stream.of(10, 20, 50, 35, 40, 60, 5).max(Comparator.naturalOrder()).get());
        System.out.println(Stream.of(10, 20, 50, 35, 40, 60, 5).min(Comparator.naturalOrder()).get());

        // 8. forEachOrder
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("forEach with parallelStream : ");
        list1.parallelStream().forEach(System.out::println);
        System.out.println("forEachOrdered with parallelStream : ");
        list1.parallelStream().forEachOrdered(System.out::println);
    }
}
