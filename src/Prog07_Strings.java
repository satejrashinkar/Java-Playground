import java.util.Scanner;

public class Prog07_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name = new String("Satej");
        String name = "Satej";
        System.out.println("Your name is : " + name);

        int a = 6;
        float b = 3.14f;
        System.out.printf("The value of a is %d and value of b is %.2f \n", a, b);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Entered string is : " + str);
    }
}
