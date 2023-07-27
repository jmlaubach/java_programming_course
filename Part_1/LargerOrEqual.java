package Part_1;

import java.util.Scanner;

public class LargerOrEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        if (num1 > num2) {
            System.out.println("Greater number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("Greater number is: " + num2);
        } else {
            System.out.println("The numbers are equal.");
        }
    }
}

//Write a program that prompts the user for two integers and prints the larger of the two. 
//If the numbers are the same, then the program informs us about this as well.