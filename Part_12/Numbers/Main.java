package Part_12.Numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many random numbers should be printed?");
        int number = Integer.valueOf(scanner.nextLine());

        RandGenerator rand = new RandGenerator();

        rand.generateNumbers(number);

        System.out.println(rand);
    }
}
