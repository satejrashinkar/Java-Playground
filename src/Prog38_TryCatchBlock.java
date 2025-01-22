public class Prog38_TryCatchBlock {
    public static void main(String[] args) {
        int a = 5000;
        int b = 0;
        try {
            int c = a/b;
            System.out.println("The division is " + c);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        System.out.println("End");
    }
}
