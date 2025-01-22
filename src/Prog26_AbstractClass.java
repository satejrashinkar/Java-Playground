abstract class Parent {
    public Parent() {
        System.out.println("Inside default ctor of Base1 Class");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}

abstract class Child2 extends Parent {

}

public class Prog26_AbstractClass {
    public static void main(String[] args) {
        Child child = new Child();
        child.greet();

        // Parent parent = new Parent();  // Error: Abstract Class cannot be instantiated
    }
}
