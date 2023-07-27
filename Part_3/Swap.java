package Part_3;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Integer[] numbers = new Integer[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        printArray(numbers);

        System.out.println("Give two indices to swap: ");
        int num1 = Integer.valueOf(reader.nextLine());
        int num2 = Integer.valueOf(reader.nextLine());

        changeIndices(num1, num2, numbers);

        printArray(numbers);
    }

    public static void changeIndices(int num1, int num2, Integer[] numbers) {
        int temp = numbers[num1];
        numbers[num1] = numbers[num2];
        numbers[num2] = temp;
    }

    public static void printArray(Integer[] numbers) {
        for (Integer number: numbers) {
            System.out.println(number);
        }
    }
}
