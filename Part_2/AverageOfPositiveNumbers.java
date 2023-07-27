package Part_2;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float num_sum = 0;
        float total_nums = 0;

        while (true) {
            System.out.println("Give a number:");
            int current_num = Integer.valueOf(reader.nextLine());

            if (current_num == 0) {
                break;
            }

            if (current_num > 0) {
                num_sum = num_sum + current_num;
                total_nums = total_nums + 1;
            }
        }

        double num_average = (num_sum / total_nums);
        if (num_average > 0) {
            System.out.println("Average of the positive numbers is: " + num_average);
        }
        else {
            System.out.println("Cannot calculate the average.");
        }
    }
}
