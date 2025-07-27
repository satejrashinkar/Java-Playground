package collectionframework;

import java.lang.ref.WeakReference;

class Phone {
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

public class Prog11_GarbageCollection {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple","iPhone16");
        System.out.println(phone);
        phone = null;
        System.gc();
        System.out.println(phone);

        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Samsung","Galaxy Ultra"));
        System.out.println("phoneWeakReference : " + phoneWeakReference.get());
        System.gc();
        try {
            Thread.sleep(10000);
        } catch (Exception ignored) {

        }
        System.out.println("phoneWeakReference : " + phoneWeakReference.get());
    }
}
