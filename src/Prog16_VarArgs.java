public class Prog16_VarArgs {
//    static int add(int a,int b){
//        return a+b;
//    }

//    static int add(int a,int b,int c){
//        return a+b+c;
//    }

    public static int add(int ...arr) {
        int sum = 0;
        for (int a : arr) sum += a;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(5));
        System.out.println(add(4, 6));
        System.out.println(add(4, 5, 6));
        System.out.println(add(4, 5, 6, 7, 8, 9));
    }
}
