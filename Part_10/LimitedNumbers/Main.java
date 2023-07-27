package Part_10.LimitedNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true) {
            int i = Integer.valueOf(scanner.nextLine());
            if (i < 0) {
                break;
            }

            numbers.add(i);
        }

        numbers.stream()
            .filter(x -> x >= 1 && x <=5)
            .forEach(item -> System.out.println(item));
    }
}
