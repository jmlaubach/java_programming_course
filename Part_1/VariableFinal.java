package Part_1;

import java.util.Scanner;

public class VariableFinal {
    /*Write a program that asks the user for a string, an integer, a floating-point number, and a boolean. 
    The program should then print the values given by the user.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String inputString = String.valueOf(scanner.nextLine());
        System.out.println("Give an integer:");
        int inputInteger = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a floating-point:");
        Double inputFloat = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean inputBool = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + inputString);
        System.out.println("You gave the integer " + inputInteger);
        System.out.println("You gave the floating-point " + inputFloat);
        System.out.println("You gave the boolean " + inputBool);
    }
}
