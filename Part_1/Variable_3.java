package Part_1;

import java.util.Scanner;

public class Variable_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        double number = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + number);
    }
}
