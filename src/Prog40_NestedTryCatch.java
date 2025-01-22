import java.util.Scanner;

public class Prog40_NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = {80, 96, 85};
        System.out.println("Enter the array index");
        int index = sc.nextInt();
        try {
            System.out.println("Inside Level 1 Try Block");
            try {
                System.out.println("Inside Level 2 Try Block");
                System.out.println("Value at index " + index + " is " + marks[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception in Level 2");
                System.out.println("ArrayIndexOutOfBoundsException " + e);
            }
        } catch (Exception e) {
            System.out.println("Exception in Level 1 " + e);
        }
    }
}
