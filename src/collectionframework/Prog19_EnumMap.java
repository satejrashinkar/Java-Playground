package collectionframework;

import java.util.EnumMap;
import java.util.Map;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Prog19_EnumMap {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.FRIDAY, "Study");
        map.put(Day.MONDAY, "Office");
        System.out.println(Day.FRIDAY.ordinal());
        System.out.println(map);
    }
}
