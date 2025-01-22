public class Prog15_MethodOverloading {
    static void foo(){
        System.out.println("Good Morning");
    }

    static void foo(String name){
        System.out.println("Good Morning " + name);
    }

    static void foo(String firstName, String lastName){
        System.out.println("Good Morning " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        foo();
        foo("Satej");
        foo("Satej","Rashinkar");
    }
}
