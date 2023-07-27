package Part_4.Statistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Statistics sum = new Statistics();
        Statistics sum_even = new Statistics();
        Statistics sum_odd = new Statistics();
        
        System.out.println("Enter numbers: ");

        while (true) {
            int num_choice = Integer.valueOf(reader.nextLine());

            if (num_choice == -1) {
                break;
            } else if (num_choice % 2 == 0) {
                sum_even.addNumber(num_choice);
            } else {
                sum_odd.addNumber(num_choice);
            }

            sum.addNumber(num_choice);
        }

        System.out.println("Sum: " + sum.sum());
        System.out.println("Sum of even numbers: " + sum_even.sum());
        System.out.println("Sum of odd numbers: " + sum_odd.sum());
    }
}
