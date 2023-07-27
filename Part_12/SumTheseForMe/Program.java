package Part_12.SumTheseForMe;

public class Program {
    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0));
        System.out.println(sum(numbers, 0, 0));
        System.out.println(sum(numbers, 0, 1));
        System.out.println(sum(numbers, 0, 1));
        System.out.println(sum(numbers, -1, 999));
    }

    public static int sum(int[] array, int smallest, int largest) {
        int sum = 0;

        if (smallest < 0) {
            smallest = 0;
        }

        if (largest > array.length) {
            largest = array.length;
        }

        for (int i = smallest; i < largest; i++) {
            sum += array[i];
        }

        return sum;
    }
}
