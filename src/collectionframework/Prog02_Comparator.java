package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s2.length() - s1.length();
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(),this.getGpa());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class Prog02_Comparator {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(1);
        integerList.add(3);
        integerList.add(2);
        System.out.println("Before sorting : " + integerList);
//        integerList.sort(new MyComparator());
        integerList.sort((a, b) -> b - a);
        System.out.println("After sorting : " + integerList);

        List<String> fruitsList = Arrays.asList("banana", "date", "apple");
//        fruitsList.sort(new StringLengthComparator());
        fruitsList.sort((a, b) -> b.length() - a.length());
        System.out.println(fruitsList);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Charlie", 3.5));
        studentList.add(new Student("Bob", 3.7));
        studentList.add(new Student("Alice", 3.5));
        studentList.add(new Student("Akshit", 3.9));

//        studentList.sort((s1, s2) -> {
//            if (s2.getGpa() - s1.getGpa() > 0) return 1;
//            else if (s2.getGpa() - s1.getGpa() < 0) return -1;
//            return s1.getName().compareTo(s2.getName());
//        });

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        studentList.sort(comparator);

        for (Student s : studentList) {
            System.out.println(s.getName() + " : " + s.getGpa());
        }
    }
}
