import java.util.ArrayList;

class MyGenericClass<T1> {
    int val;
    private T1 t1;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public MyGenericClass(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }
}

public class Prog54_Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // arrayList.add("String 1");
        arrayList.add(50);
        arrayList.add(100);
        arrayList.add(150);
        arrayList.add(200);
        // arrayList.add("String 2");
        int a = arrayList.get(2);
        System.out.println(a);

        MyGenericClass<String> g1 = new MyGenericClass<>(5000, "My String");
        String str = g1.getT1();
        System.out.println(str);

    }
}
