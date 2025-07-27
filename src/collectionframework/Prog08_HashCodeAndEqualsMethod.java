package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person Details => Id : " + id + " Name : " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name,other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }
}

public class Prog08_HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        map.put(p1, "Engineer");
        map.put(p2, "Designer");
        map.put(p3, "Manager");

        System.out.println(map.size());
        for (Map.Entry<Person, String> entry : map.entrySet()) {
            System.out.println(entry.getKey().getName() + " : " + entry.getValue());
        }

        System.out.println(p1);
    }
}
