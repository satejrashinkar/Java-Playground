public class Prog05_Operators {
    public static void main(String[] args) {
        int a = 4;
        int b = 6 + a;
        System.out.println("Value of b is : " + b);

        // Modulo Operator
        int c = 6 % a;
        System.out.println("Value of c is : " + c);
        System.out.println("Value of 4.8 % 1.1 is : " + 4.8%1.1);

        int d = 10;
        d += 5;
        System.out.println("Value of d is : " + d);

        // Comparison Operators
        System.out.println("6 == 8 : " + (6 == 8));
        System.out.println("6 == 6 : " + (6 == 6));
        System.out.println("64 > 10 : " + (64 > 10));

        // Logical Operators
        System.out.println(64 > 5 && 64 > 8);

        // Bitwise Operators
        System.out.println("2&3 : " + (2&3));

    }
}
