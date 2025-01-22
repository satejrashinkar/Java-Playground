class ClassOne {
    int a;

    ClassOne(int a) {
        System.out.println("Parameterised ctor of ClassOne and value of a is " + a);
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public int returnOne() {
        return 1;
    }

}

class ClassTwo extends ClassOne{
    ClassTwo(int c){
        super(c);
        System.out.println("Parameterised ctor of ClassTwo");
    }
}

public class Prog22_ThisAndSuperKeyword {
    public static void main(String[] args) {
        ClassOne c = new ClassOne(100);
        System.out.println(c.getA());

        ClassTwo c2 = new ClassTwo(500);
    }
}
