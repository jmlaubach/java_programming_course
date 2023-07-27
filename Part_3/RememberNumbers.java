package Part_3;

import java.util.Scanner;
import java.util.ArrayList;

public class RememberNumbers {
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
        int size = (list.size() - 1);

        for (int i = 0; i <= size; i++) {
            System.out.println(list.get(i));
        }
    }
}
