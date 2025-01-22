class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class Prog42_ThrowAndThrowsKeyword {
    public static double area(int radius) throws NegativeRadiusException {
        if (radius < 0) throw new NegativeRadiusException();
        return Math.PI * radius * radius;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int result = divide(5, 5);
            System.out.println("Result : " + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Area of Circle is : " + area(5));
        } catch (NegativeRadiusException e) {
            System.out.println(e);
        }
    }
}
