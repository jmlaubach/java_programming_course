package Part_2;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a positive integer:");
        int num_choice = Integer.valueOf(reader.nextLine());

        for (int i = 0; i <= num_choice; i++) {
            System.out.println(i);
        }
    }
}