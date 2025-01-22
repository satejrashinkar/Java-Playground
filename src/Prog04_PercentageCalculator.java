import java.util.Scanner;

public class Prog04_PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalMarks = 100;
        int numberOfSubjects = 5;
        System.out.println("Enter the marks for subject 1 :");
        float sub1 = sc.nextFloat();
        System.out.println("Enter the marks for subject 2 :");
        float sub2 = sc.nextFloat();
        System.out.println("Enter the marks for subject 3 :");
        float sub3 = sc.nextFloat();
        System.out.println("Enter the marks for subject 4 :");
        float sub4 = sc.nextFloat();
        System.out.println("Enter the marks for subject 5 :");
        float sub5 = sc.nextFloat();

        float marksObtained = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentageObtained = (marksObtained / (totalMarks*numberOfSubjects)) * 100;
        System.out.println("Your percentage is : " + percentageObtained + "%");
    }
}
