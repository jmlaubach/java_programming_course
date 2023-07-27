package Part_2;

import java.util.Scanner;

public class SumOfASequence {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Last number?");

        int lastnum = Integer.valueOf(reader.nextLine());
        int total = 0;
        int current_num = 1;

        while (true) {
            if (current_num <= lastnum) {
                total += current_num;
                current_num++;
            }
            else {
                break;
            }
        }
        System.out.println(total);
    }
}
