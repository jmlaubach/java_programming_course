package Part_3;

import java.util.Scanner;

public class IsItTrue {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give a string: ");
        String word = reader.nextLine();

        if (word.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
