package Part_1;

import java.util.Scanner;

public class SpeedingTicket {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int speed_limit = 120;
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());
        if (speed > speed_limit) {
            System.out.println("Speeding ticket!");
        }
    }
}
