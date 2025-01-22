class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 10;
        name = "Test Name";
    }

    public MyMainEmployee(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Prog20_Constructors {
    public static void main(String[] args) {
        MyMainEmployee emp = new MyMainEmployee(20,"EmpName");
        System.out.println("Employee Id is : " + emp.getId());
        System.out.println("Employee Name is : " + emp.getName());
    }
}
