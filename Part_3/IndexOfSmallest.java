package Part_3;

import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Type in numbers. Type 9999 to stop.");
        while(true) {
            int num = Integer.valueOf(reader.nextLine());
            if (num == 9999) {
                break;
            } else {
                list.add(num);
            }
        }

        int smallest = list.get(0);

        for(int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (smallest > num) {
                smallest = num;
            }
        }

        System.out.println("Smallest number: " + smallest);

        for(int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
