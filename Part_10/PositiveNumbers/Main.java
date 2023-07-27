package Part_10.PositiveNumbers;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(-2);
        values.add(17);
        values.add(-6);
        values.add(8);

        System.out.println(positive(values));
    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> positives = numbers.stream().filter(value -> value > 0).collect(Collectors.toList());
        return positives;
    }
}
