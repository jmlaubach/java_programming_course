package Part_2;

public class Greatest {
    public static void main(String[] args) {
        int answer = greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }

    public static int greatest(int number1, int number2, int number3) {
        while (true) {
            if (number1 > number2) {
                if (number1 > number3) {
                    return number1;
                }
            } else if (number2 > number1) {
                if (number2 > number3) {
                    return number2;
                }
            } else {
                return number3;
            }
        }
    }
}
