package Part_2;

import java.util.Scanner;

public class NumberofNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neg_sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int current_num = Integer.valueOf(scanner.nextLine());

            if (current_num == 0) {
                break;
            }

            if (current_num < 0) {
                neg_sum = neg_sum + 1;
            }
        }

        System.out.println("Number of negative numbers entered: " + neg_sum);

    }
}
