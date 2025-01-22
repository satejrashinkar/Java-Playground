public class Prog12_MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] marks; // 1D Array
        int[][] flats; // 2D Array

        flats = new int[2][3]; // 2 rows and 3 cols
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Printing 2D Array using for loop
        for (int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
