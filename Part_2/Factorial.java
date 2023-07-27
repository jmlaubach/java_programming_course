package Part_2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a number: ");
        int num_choice = Integer.valueOf(reader.nextLine());
        int i = 1;
        int total = 1;

        while (i < num_choice) {
            int i2 = total;
            i++;
            total = i2 * i;
        }
        System.out.println("Factorial: " + total);
    }
}
