package Part_10.RegularExpressions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = scanner.nextLine();
        if(timeOfDay(word)) {
            System.out.println("The form is CORRECT.");
        } else {
            System.out.println("The form is INCORRECT.");
        }
    }

    public static boolean isDayOfWeek(String string) {
        String regex = "(mon|tue|wed|thu|fri|sat|sun)";

        if (string.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean allVowels(String string) {
        String regex = "(a|e|i|o|u)+";

        if (string.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean timeOfDay(String string) {
        String regex = "(((0|1)[0-9])|(2[0-3])):[0-5][0-9]:[0-5][0-9]";

        if (string.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }
}
