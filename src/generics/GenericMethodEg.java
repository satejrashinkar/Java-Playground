package generics;

public class GenericMethodEg {
    public static void main(String[] args) {
        GenericMethodEg genericMethodEg = new GenericMethodEg();
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        String[] stringArray = {"Hello", "World"};
        Double[] doubleArray = {1.11, 4.57, 56d, 4.6425};

        genericMethodEg.printArray(intArray);
        genericMethodEg.printArray(stringArray);
        genericMethodEg.printArray(doubleArray);
    }

    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
