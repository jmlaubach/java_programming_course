package Part_3;

public class PrintNeatly {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[5];

        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        printNeatly(numbers);
    }

    public static void printNeatly(Integer[] array) {
        int index = 0;
        while (index < 4) {
            System.out.print(array[index] + ", ");
            index++;
        }
        System.out.print(array[4]);
    }
}
