package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        System.out.println(getArraySum(Arrays.asList(1,2,3,4,5)));

    }
    public static double getArraySum(List<? extends Number> numbers){
        double sum = 0;
        for (Number number : numbers){
            sum += number.doubleValue();
        }
        return sum;
    }
}
