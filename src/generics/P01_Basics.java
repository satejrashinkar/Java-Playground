package generics;

import java.util.ArrayList;

public class P01_Basics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello World");
        list.add(123);
        list.add(3.14);

        String s = (String) list.get(0);
        System.out.println(s);

//        ClassCastException
//        String s2 = (String) list.get(1);
//        System.out.println(s2);

        Box<Integer> box = new Box<>(); // Box is now type safe
        box.setValue(1);
        Integer num = box.getValue();
        System.out.println("Printing Box value : " + num);

        Pair<String, Integer> pair = new Pair<>("Age", 20);
        System.out.println("pair key : " + pair.getKey());
        System.out.println("pair value : " + pair.getValue());
    }
}
