public class Prog11_Arrays {
    public static void main(String[] args) {
        // Store the marks of 500 students
//        int numberOfStudents = 500;
//        int [] marks = new int[numberOfStudents];
//        marks[0] = 100;
//        marks[1] = 90;
//        marks[2] = 80;
//        marks[3] = 70;
//        marks[4] = 60;
//
//        System.out.println("Array length : " + marks.length);
//        System.out.println(marks[2]);

        int[] marks2;
        marks2 = new int[5];

        int []numbers = {10,20,30,40,50};
        System.out.println(numbers.length);

        float[] nums = {98.3f,87.6f,55.5f,76.0f,90.4f};
        System.out.println(nums.length);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

        String[] students = {"Abc","Def","Ghi","Jkl"};
        System.out.println(students.length);
        System.out.println(students[2]);

        int [] marks = {80,96,78,85,90};
        System.out.println("Printing array elements in normal order");
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        // Reverse Order
        System.out.println("Printing array elements in reverse order");
        for (int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        // For Each Loop
        System.out.println("Printing array elements using for each loop");
        for(int element : marks){
            System.out.println(element);
        }
    }
}
