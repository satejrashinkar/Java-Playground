interface sampleInterface {
    void method1();

    void method2();
}

interface childSampleInterface extends sampleInterface {
    void method3();

    void method4();
}

class MySampleClass implements childSampleInterface {

    @Override
    public void method3() {
        System.out.println("Method 3");
    }

    @Override
    public void method4() {
        System.out.println("Method 4");
    }

    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }
}

public class Prog29_InheritanceInInterfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}
