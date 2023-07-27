package Part_3;

public class SumOfArray {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[5];

        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        System.out.println(sumOfNumbersInArray(numbers));
    }

    public static int sumOfNumbersInArray(Integer[] numbers) {
        int sum = 0;
        for (Integer number: numbers) {
            sum += number;
        }
        return sum;
    }
}
