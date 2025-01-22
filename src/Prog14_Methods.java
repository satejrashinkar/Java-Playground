public class Prog14_Methods {
    void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void modifyArray(int[] arr){
        arr[0] = 98;
    }

    public static void main(String[] args) {
        // if the method is static
        System.out.println(add(5, 7));

        // if the method is not static
        Prog14_Methods obj = new Prog14_Methods();
        obj.sayHello("Satej");

        int x = 10, y = 20;
        System.out.println("Before Swapping : x = " + x + " and y = " + y);
        swap(x, y);
        System.out.println("After Swapping : x = " + x + " and y = " + y);

        int arr[] = {1,2,3,4,5,6};
        System.out.println("Before Modifying Array : ");
        for (int element : arr) System.out.print(element + " ");
        System.out.println();
        modifyArray(arr);
        System.out.println("After Modifying Array : ");
        for (int element : arr) System.out.print(element + " ");
        System.out.println();
    }
}
