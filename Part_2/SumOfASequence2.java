package Part_2;

import java.util.Scanner;

public class SumOfASequence2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Starting number?");
        int startnum = Integer.valueOf(reader.nextLine());
        System.out.println("Last number?");
        int lastnum = Integer.valueOf(reader.nextLine());

        int total = startnum;

        while (true) {
            if (startnum < lastnum) {
                startnum++;
                total += startnum;
                System.out.println("The total is " + total);
            }
            else {
                break;
            }
        }
        System.out.println(total);
    }
}
