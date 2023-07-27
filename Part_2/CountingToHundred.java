package Part_2;

import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give an integer:");
        int num_choice = Integer.valueOf(reader.nextLine());

        for (int i = num_choice; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
