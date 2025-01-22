public class Prog09_Conditionals {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18){
            System.out.println("You can vote!");
        }else{
            System.out.println("You cannot vote!");
        }

        int experience = 5;
        switch (experience){
            case 1:
                System.out.println("You are a fresher");
                break;
            case 5:
                System.out.println("You are experienced");
                break;
            default:
                System.out.println("Enter a valid value!");
        }

        // Enhanced Switch Case
        String str = "Good Morning";
        switch (str){
            case "Good Morning" -> {
                System.out.println("Good Morning");
                System.out.println("Good Morning");
                System.out.println("Good Morning");
            }
            case "Good Evening" -> {
                System.out.println("Good Evening");
                System.out.println("Good Evening");
            }
            case "Good Afternoon" -> System.out.println("Good Afternoon");
            default -> System.out.println("Hello World");
        }

    }
}
