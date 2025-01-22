class Phone {
    public void printName() {
        System.out.println("My name is Class Phone");
    }

    public void sayHelloFromPhone() {
        System.out.println("Class Phone says Hello");
    }
}

class SmartPhone extends Phone {
    public void printName() {
        System.out.println("My name is Class SmartPhone");
    }

    public void sayHelloFromSmartPhone() {
        System.out.println("Class SmartPhone says Hello");
    }
}

public class Prog24_DynamicMethodDispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone smObj = new SmartPhone();
//        obj.printName();
//        obj.sayHelloFromPhone();

        Phone phone = new SmartPhone(); // Allowed
        // SmartPhone smartPhone = new Phone();    // Error
        phone.sayHelloFromPhone();
        phone.printName();
        // phone.sayHelloFromSmartPhone();    // Error - only super class methods can be called
    }
}
