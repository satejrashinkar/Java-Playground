import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class Prog41_ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        try {
            if (a < 99){
                // throw new MyException();
                throw new ArithmeticException("This is an arithmetic exception");
            }
        } catch (Exception e) {
            System.out.println("Inside catch block");
            System.out.println("getMessage() : " + e.getMessage());
            System.out.println("toString() : " + e.toString());
            System.out.println("e : " + e);
            e.printStackTrace();
        }
    }
}
