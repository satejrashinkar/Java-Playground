public class Prog43_FinallyBlock {
    public static int greet(){
        try {
            int a = 50;
            int b = 0;
            return a/b;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("End of Function");
        }
        return -1;
    }

    public static void main(String[] args) {
        int division = greet();
        System.out.println("division is : " + division);
    }
}
