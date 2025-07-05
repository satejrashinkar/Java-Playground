package generics;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class GenericsInEnums {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day.getClass().getName());
        System.out.println(day);
    }
}
