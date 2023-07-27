package Part_3;

import java.util.Scanner;
import java.util.ArrayList;

public class IndexOf {
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

        System.out.println("Search for? ");
        int num = Integer.valueOf(reader.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                System.out.println(num + " is at index " + i);
            }
        }
    }
}
