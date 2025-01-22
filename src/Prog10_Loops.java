public class Prog10_Loops {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            System.out.println("Index is : " + i++);
        }

        int a = 0;
        do {
            System.out.println("a is : " + a++);
        }while (a < 5);


        for (int j=1;j<=10;j++){
            System.out.println(j);
        }

        // Even Numbers from 0 to 100
        for (int e=0;e<=100;e+=2){
            System.out.println(e);
        }

        // Odd Numbers from 0 to 100
        for (int e=1;e<=100;e+=2){
            System.out.println(e);
        }
    }
}
