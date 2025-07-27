package stream;

import java.util.List;
import java.util.stream.Stream;

public class Prog05_ParallelStream {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(10000).toList();
        List<Long> factorialList = list.stream().map(Prog05_ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Total time with sequential stream : " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        factorialList = list.parallelStream().map(Prog05_ParallelStream::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Total time with parallel stream: " + (endTime - startTime) + " ms");
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
