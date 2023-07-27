package Part_2;

public class FromOneToParameter {
    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        int counter = 0;
        
        while (counter < number) {
            counter++;
            System.out.println(counter);
        }
    }
}
