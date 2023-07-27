package Part_3;

import java.util.Scanner;
import java.util.ArrayList;

public class GreatestInList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Type in numbers. Type -1 to stop.");
        while(true) {
            int num = Integer.valueOf(reader.nextLine());
            if (num == -1) {
                break;
            } else {
                list.add(num);
            }
        }

        int greatest = list.get(0);

        for(int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (greatest < num) {
                greatest = num;
            }
        }

        System.out.println("The greatest number is: " + greatest);
    }
}
