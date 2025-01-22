import java.util.Scanner;

public class Prog03_UserInput {
    public static void main(String[] args) {
        System.out.println("Taking user input");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of these numbers is : " + sum);

        System.out.println("Enter a number");
        System.out.println("checking hasNextInt : " + sc.hasNextInt());

//        System.out.println("Enter your name :");
//        // String name = sc.next();  // Ignores after spaces
//        String name = sc.nextLine();    // Takes input of entire line
//        System.out.println("Your name is " + name);
    }
}
