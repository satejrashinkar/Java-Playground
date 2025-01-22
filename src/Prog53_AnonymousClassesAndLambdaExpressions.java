@FunctionalInterface
interface AnonymousDemoInterface {
    void method1(int a);

//    void method2();
}

//class AnonymousDemo1 implements AnonymousDemoInterface {
//    @Override
//    public void method1() {
//        System.out.println("Inside method1");
//    }
//}

//class AnonymousDemo implements AnonymousDemoInterface {
//    public void display() {
//        System.out.println("Inside display method of AnonymousDemo class");
//    }
//
//    @Override
//    public void method1() {
//        System.out.println("Inside method1 of AnonymousDemo class");
//    }
//
//    @Override
//    public void method2() {
//        System.out.println("Inside method2 of AnonymousDemo class");
//    }
//}

public class Prog53_AnonymousClassesAndLambdaExpressions {
    public static void main(String[] args) {
//        AnonymousDemo demo = new AnonymousDemo();
//        demo.display();
//        demo.method1();
//        demo.method2();

        // Anonymous Class
//        AnonymousDemoInterface obj = new AnonymousDemoInterface() {
//            @Override
//            public void method1() {
//                System.out.println("Inside method1");
//            }
//        };
//
//        obj.method1();

        // Lambda Expressions
//        AnonymousDemoInterface obj1 = new AnonymousDemo1();
//        obj1.method1();

        AnonymousDemoInterface obj2 = (a) -> {
            System.out.println("I am method 1 using Lambda Expression " + a);
        };
        obj2.method1(5);
    }
}
