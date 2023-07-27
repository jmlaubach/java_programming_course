package Part_1;

import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String first_s = scanner.nextLine();
        System.out.println("Enter the second string:");
        String second_s = scanner.nextLine();

        if (first_s.equals(second_s)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}