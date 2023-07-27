package Part_3;

import java.util.Scanner;

public class IndexNotFound {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Integer[] numbers = new Integer[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        System.out.print("Search for which number? ");
        int num_choice = Integer.valueOf(reader.nextLine());

        findIndex(num_choice, numbers);
    }

    public static void findIndex(int num_choice, Integer[] numbers) {
        int index = 0;
        boolean check = false;
        for (Integer number: numbers) {
            if (number == num_choice) {
                System.out.println(num_choice + " is at index " + index);
                check = true;
            }
            index++;
        }

        if (check == false) {
            System.out.println(num_choice + " was not found.");
        }
    }
}
