import java.util.Scanner;

public class Prog39_HandlingExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = {80, 96, 85};

        System.out.println("Enter the array index");
        int index = sc.nextInt();
        System.out.println("Enter the number by which you want to divide with");
        int number = sc.nextInt();

        try {
            System.out.println("Inside Try Block");
            System.out.println("Initial Value : " + marks[index]);
            System.out.println("Modified Value : " + marks[index] / number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Occurred " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Occurred " + e);
        } catch (Exception e) {
            System.out.println("Some other Exception Occurred " + e);
        }

    }
}
