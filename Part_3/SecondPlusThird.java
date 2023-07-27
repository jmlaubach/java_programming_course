package Part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> num_list = new ArrayList<>();
        System.out.println("Provide numbers to add to a list: ");

        while(true) {
            int nums = Integer.valueOf(reader.nextLine());
            if (nums == 0) {
                break;
            } else {
                num_list.add(nums);
            }
        }
        System.out.println(num_list.get(0));
    }
}
