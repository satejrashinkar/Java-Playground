package collectionframework;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Prog27_LambdaExpression {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Hello from Thread t1");
        });
        t1.start();

        MathOperation sumOperation = (a, b) -> a + b;
        MathOperation subtractOperation = (a, b) -> a - b;
        System.out.println(sumOperation.operate(10, 5));
        System.out.println(subtractOperation.operate(10, 5));

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(1));
        System.out.println(isEven.test(2));

        Predicate<String> isWordStartingWithA = s -> s.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = s -> s.toLowerCase().endsWith("t");
        Predicate<String> isWordStartsWithAandEndsWithT = isWordStartingWithA.and(isWordEndingWithT);

        System.out.println(isWordStartingWithA.test("Ankit"));
        System.out.println(isWordStartingWithA.test("Peter"));

        System.out.println(isWordStartsWithAandEndsWithT.test("Ankit"));

        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.apply(100));

        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(5);

        Consumer<List<Integer>> printList = integerList -> {
            for (int num : integerList) System.out.println(num);
        };

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        printList.accept(list);

        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> ((x + y) % 2 == 0);
        System.out.println(isSumEven.test(2, 4));
        System.out.println(isSumEven.test(1, 4));

        BiFunction<String, String, Integer> getConcatenatedStringLen = (s1, s2) -> s1.length() + s2.length();
        System.out.println(getConcatenatedStringLen.apply("Hello", "World"));

        // Method Reference
        List<String> students = Arrays.asList("Sam", "Ram", "Anil", "Peter");
        students.forEach(student -> System.out.println(student));
        students.forEach(System.out::println);

        // Constructor Reference
        List<String> mobileNames = Arrays.asList("A", "B", "C");
        List<MobilePhone> mobilePhones1 = mobileNames.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());
        List<MobilePhone> mobilePhones2 = mobileNames.stream().map(MobilePhone::new).collect(Collectors.toList());
        System.out.println(mobilePhones1);
        System.out.println(mobilePhones2);
    }
}

class MobilePhone {
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MobilePhone{" + "name='" + name + '\'' + '}';
    }
}
