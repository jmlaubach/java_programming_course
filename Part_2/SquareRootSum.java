package Part_2;

import java.util.Scanner;

public class SquareRootSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number_1 = Integer.valueOf(scanner.nextLine());
        int number_2 = Integer.valueOf(scanner.nextLine());
        int sum = (number_1 + number_2);

        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);
    }
}