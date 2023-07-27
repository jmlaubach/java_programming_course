package Part_2;

import java.util.Scanner;

public class WhereToWhere {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Where to? ");
        int num_1 = Integer.valueOf(reader.nextLine());
        System.out.println("Where from?");
        int num_2 = Integer.valueOf(reader.nextLine());

        for (int i = num_2; i <= num_1; i++) {
            System.out.println(i);
        }
    }
}
