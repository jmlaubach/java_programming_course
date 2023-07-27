package Part_2;

import java.util.Scanner;

public class NumberOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_total = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num != 0) {
                num_total = num_total + 1;
                continue;
            }
        }

        System.out.println("Number of numbers: " + num_total);
    }
}
/*
Write a program that reads values from the user until they input a 0. 
After this, the program prints the total number of inputted values. 
The zero that's used to exit the loop should not be included in the total number count.
 */