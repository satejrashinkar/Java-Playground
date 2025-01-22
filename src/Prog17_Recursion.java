public class Prog17_Recursion {
    static int factorialRecursive(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    static int factorialIterative(int n) {
        if (n == 0 || n == 1) return 1;
        int factorial = 1;
        for (int i = n; i >= 2; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("Using recursive - factorial of n is : " + factorialRecursive(5));
        System.out.println("Using iterative - factorial of n is : " + factorialIterative(5));
    }
}
