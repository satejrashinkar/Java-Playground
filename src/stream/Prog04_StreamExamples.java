package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Prog04_StreamExamples {
    public static void main(String[] args) {
        // 1. filtering and collecting names
        List<String> names = Arrays.asList("Anna", "Bob", "Peter", "Sam", "David", "Charlie");
        System.out.println(names.stream().filter(name -> name.length() > 3).toList());

        // 2. Squaring and sorting numbers
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(numbers.stream().map(num -> num * num).sorted().toList());

        // 3. Sum of values
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> optionalInteger = numbers1.stream().reduce(Integer::sum);
        System.out.println(numbers1.stream().reduce(Integer::sum).get());

        // 4. Counting occurrences of a character
        String sentence = "Hello World";
        System.out.println(sentence.chars().filter(ch -> ch == 'l').count());

    }
}
