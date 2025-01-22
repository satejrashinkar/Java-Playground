@FunctionalInterface
interface MyFunctionalInterface{
    void methodOne();
    // void methodTwo(); // FunctionalInterface should contain only one abstract method
}

class NewPhone extends Phone {
    @Override
    public void sayHelloFromPhone() {
        System.out.println("New Phone says Hello");
    }

    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class Prog52_Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.sayHelloFromPhone();
        System.out.println(phone.sum(5,6));
    }
}
