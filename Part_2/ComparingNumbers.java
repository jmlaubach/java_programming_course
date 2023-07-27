package Part_2;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number_1 = Integer.valueOf(scanner.nextLine());
        int number_2 = Integer.valueOf(scanner.nextLine());

        if (number_1 > number_2) {
            System.out.println(number_1 + " is greater than " + number_2);
        } else if (number_1 < number_2) {
            System.out.println(number_1 + " is smaller than " + number_2);
        } else {
            System.out.println(number_1 + " is equal to " + number_2);
        }
    }
}