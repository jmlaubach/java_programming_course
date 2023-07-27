package Part_3;

public class PrintInStars {
    public static void main(String[] args) {
        Integer[] numbers = {1, 3, 5, 7, 9};

        printArrayInStars(numbers);
    }

    public static void printArrayInStars(Integer[] array) {
        for (Integer number: array) {
            int stars = 0;
            while (stars < number) {
                System.out.print("*");
                stars++;
            }
            System.out.println("");
        }
    }
}
