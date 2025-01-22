class Circle {
    public int radius;

    Circle(int radius){
        this.radius = radius;
        System.out.println("Inside Circle Parameterised ctor");
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle {
    public int height;

    Cylinder(int radius,int height){
        super(radius);
        this.height = height;
        System.out.println("Inside Cylinder Parameterised ctor");
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class Prog25_InheritanceQuestions {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Cylinder cylinder = new Cylinder(10,20);
        System.out.println("The radius of cylinder is : " + cylinder.radius);
    }
}
