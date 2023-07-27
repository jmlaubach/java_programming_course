package Part_10.AverageOfSelected;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop.");

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            numbers.add(row);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();

        if (choice.equals("n")) {
            double negativeNumAverage = numbers.stream()
                .mapToInt(x -> Integer.valueOf(x))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();

            System.out.println(negativeNumAverage);
        }

        if (choice.equals("p")) {
            double positiveNumAverage = numbers.stream()
                .mapToInt(x -> Integer.valueOf(x))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();

            System.out.println(positiveNumAverage);
        }
    }
}