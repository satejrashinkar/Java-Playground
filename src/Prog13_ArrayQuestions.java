public class Prog13_ArrayQuestions {
    public static void main(String[] args) {
        // 1. Create an array of 5 floats and calculate their sum
        float[] marks = {78.6f,67.6f,89.9f,90.5f,89.2f};
        float sum = 0;
        for (float element : marks) sum += element;
        System.out.println("Total Marks : " + sum);

        // 2. Check if a given element is present in an array or not
        float target = 90.5f;
        boolean isElementPresent = false;
        for (float element : marks){
            if (target == element){
                isElementPresent = true;
                break;
            }
        }
        if (isElementPresent) System.out.println("Element " + target + " is present in the array");
        else System.out.println("Element " + target + " is not present in the array");

        // 3. Calculate the average of marks
        System.out.println("The average of marks is : " + sum/marks.length);

        // 4.Add 2 matrices of size 2 X 3
        int [][] matrix1 = {{1,2,3}, {4,5,6}};
        int [][] matrix2 = {{2,6,13}, {3,7,1}};

        int [][] result = {{0,0,0}, {0,0,0}};

        for (int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1[i].length;j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Printing the addition of matrices : ");
        for (int i=0;i<result.length;i++){
            for (int j=0;j<result[i].length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // 5. Reverse an Array
        int[] arr = {1,2,3,4,5,6,45,73,7,8,3,67,75,57,30,72};
        int length = arr.length;
        int n = Math.floorDiv(length,2);
        for (int i=0;i<n;i++){
            int temp = arr[i];
            arr[i] = arr[length-i-1];
            arr[length-i-1] = temp;
        }
        System.out.println("Reverse an array: ");
        for (int element : arr) System.out.print(element + " ");
        System.out.println();

        // 6. Maximum and Minimum Element in an array
        int maximumElement = Integer.MIN_VALUE;
        int minimumElement = Integer.MAX_VALUE;
        for (int element : arr){
            maximumElement = Math.max(element,maximumElement);
            minimumElement = Math.min(element,minimumElement);
        }
        System.out.println("Maximum Element is : " + maximumElement);
        System.out.println("Minimum Element is : " + minimumElement);

        // 7. Check if an array is sorted or not
        int arr2[] = {1,2,3,4,5,6};
        boolean isSorted = true;
        for (int i=0;i<arr2.length-1;i++){
            if (arr2[i] < arr2[i+1]) continue;
            else isSorted = false;
        }
        if (isSorted) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
    }
}
