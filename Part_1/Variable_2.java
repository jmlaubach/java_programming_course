package Part_1;

import java.util.Scanner;

public class Variable_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("You wrote " + number);
    }
}
