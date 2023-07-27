package Part_2;

import java.util.Scanner;

public class NumberAndSum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num_sum = 0;
        int total_nums = 0;

        while (true) {
            System.out.println("Give a number:");
            int current_num = Integer.valueOf(reader.nextLine());

            if (current_num == 0) {
                break;
            }

            if (current_num != 0) {
                num_sum = num_sum + current_num;
                total_nums = total_nums + 1;
            }
        }

        System.out.println("The sum of the entered numbers is: " + num_sum);
        System.out.println("The total amount of numbers inputted is: " + total_nums);
    }
}