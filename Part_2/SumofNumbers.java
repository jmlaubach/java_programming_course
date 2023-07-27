package Part_2;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int current_num = Integer.valueOf(scanner.nextLine());

            if (current_num == 0) {
                break;
            }

            if (current_num != 0) {
                num_sum = num_sum + current_num;
            }
        }

        System.out.println("The sum of the entered numbers is: " + num_sum);
    }
}
