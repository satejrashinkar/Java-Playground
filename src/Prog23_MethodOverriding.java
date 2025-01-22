class A {
    public void greet() {
        System.out.println("Hello from Class A");
    }
}

class B extends A {
    @Override
    public void greet() {
        System.out.println("Hello from Class B");
    }
}

public class Prog23_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.greet();

        B b = new B();
        b.greet();
    }
}
