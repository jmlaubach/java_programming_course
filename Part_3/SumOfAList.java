package Part_3;

import java.util.Scanner;
import java.util.ArrayList;

public class SumOfAList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        while(true) {
            int num = Integer.valueOf(reader.nextLine());
            if (num == -1) {
                break;
            } else {
                list.add(num);
            }
        }

        for (Integer i: list) {
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}
