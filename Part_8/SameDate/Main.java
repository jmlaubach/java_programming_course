package Part_8.SameDate;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<SimpleDate, String> dates = new HashMap<>();

        SimpleDate d = new SimpleDate(1, 2, 2000);
        dates.put(d, "First");
        dates.put(new SimpleDate(2, 3, 2000), "Second");

        System.out.println(dates.get(d));
        System.out.println(dates.get(new SimpleDate(1, 2, 2000)));
        System.out.println(dates.get(new SimpleDate(2, 3, 2000)));
    }
}
