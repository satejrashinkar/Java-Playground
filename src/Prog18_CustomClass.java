class Employee {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("Id is " + id + " and name is " + name + " Salary is " + salary);
    }

    public int getSalary() {
        return salary;
    }
}

class CellPhone {
    public void ring() {
        System.out.println("Cellphone Ringing");
    }

    public void vibrate() {
        System.out.println("Cellphone Vibrating");
    }

    public void callAFriend() {
        System.out.println("Calling a friend");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter(){
        return 4*side;
    }
}

public class Prog18_CustomClass {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.id = 1;
        emp.name = "Satej";
        emp.salary = 45000;
        System.out.println(emp.id);
        System.out.println(emp.name);
        emp.printDetails();

        Employee emp2 = new Employee();
        emp2.id = 2;
        emp2.name = "Abc";
        emp2.salary = 50000;
        emp2.printDetails();

        System.out.println("Emp2 Salary : " + emp2.getSalary());

        CellPhone cellPhone = new CellPhone();
        cellPhone.callAFriend();
        cellPhone.vibrate();
        cellPhone.ring();

        Square square = new Square();
        square.side = 5;
        System.out.println("Area of square is : " + square.area());
        System.out.println("Perimeter of square is : " + square.perimeter());
    }
}
