package Part_2;

public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThreeInRange(3, 349);
    }

    public static void divisibleByThreeInRange(int low_num, int high_num) {
        for (int i = low_num; i <= high_num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}