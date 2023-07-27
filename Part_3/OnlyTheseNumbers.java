package Part_3;

import java.util.Scanner;
import java.util.ArrayList;

public class OnlyTheseNumbers {
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

        System.out.println("From where? ");
        int num1 = Integer.valueOf(reader.nextLine());
        System.out.println("To where? ");
        int num2 = Integer.valueOf(reader.nextLine());

        for (int i = (num1 - 1); i <= (num2 - 1); i++) {
            System.out.println(list.get(i));
        }
    }
}
