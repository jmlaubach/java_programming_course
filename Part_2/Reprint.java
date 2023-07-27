package Part_2;

import java.util.Scanner;

public class Reprint {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times?");
        int number = Integer.valueOf(reader.nextLine());
        int counter = 0;

        while (counter < number) {
            counter++;
            printText();
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method.");
    }
}
