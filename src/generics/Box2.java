package generics;

public class Box2 {
    // Generic Type Constructor
    public <T> Box2(T value) {
        System.out.println("Inside ctor of Box2 Class");
        System.out.println("Value is : " + value);
    }

    public static void main(String[] args) {
        Box2 box2 = new Box2("Test String");
    }
}
