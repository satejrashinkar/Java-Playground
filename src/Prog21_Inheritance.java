class Base {
    int x;

    Base() {
        System.out.println("Inside Base Class Default ctor");
    }

    Base(int x) {
        this.x = x;
        System.out.println("Inside Base Class Parameterised ctor with value of x as " + x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void print() {
        System.out.println("Inside Print Method in Base Class");
    }
}

class Derived extends Base {
    int y;

    Derived() {
//        super(10);  // to call parameterised ctor. by default the default ctor will be called
        System.out.println("Inside Derived Class Default ctor");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("Inside Derived Class Parameterised ctor with value of x as " + x + " and value of y as " + y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class ChildOfDerived extends Derived {
    ChildOfDerived() {
        System.out.println("Inside Default ctor of child of Derived Class");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("Inside Child of Derived Class Parameterised ctor with value of x as " + x + " and value of y as " + y
                + " and value of z as " + z);
    }
}

public class Prog21_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(20);
        System.out.println(b.getX());

        Derived obj = new Derived();
        obj.setX(10);
        obj.setY(50);
        System.out.println(obj.getX());
        System.out.println(obj.getY());

        Derived d = new Derived(100, 200);
        System.out.println(d.getX());
        System.out.println();
        ChildOfDerived childOfDerived = new ChildOfDerived(1, 2, 3);
    }
}