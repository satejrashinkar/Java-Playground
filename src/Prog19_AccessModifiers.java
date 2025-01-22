class MyEmployee {
    private int id;
    private String name;

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

public class Prog19_AccessModifiers {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        emp.setId(1);
        emp.setName("Abc");
        System.out.println("Employee Id is : " + emp.getId());
        System.out.println("Employee Name is : " + emp.getName());
    }
}
