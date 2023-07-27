package Part_2;

import java.util.Scanner;

public class RepeatBreakRemember {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give numbers: ");

        float sum = 0;
        float num_total = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int num_choice = Integer.valueOf(reader.nextLine());

            if (num_choice == -1) {
                break;
            }

            if (num_choice != -1) {
                sum += num_choice;
                num_total++;
                if (num_choice % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
            }
        }
        double average = (sum / num_total);

        int sum_int = (int) sum;
        int num_total_int = (int) num_total;

        System.out.println("Thanks! Bye!");
        System.out.println("Sum: " + sum_int);
        System.out.println("Numbers: " + num_total_int);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
