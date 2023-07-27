package Part_2;

public class StarSign {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);

        printSquare(4);

        printRectangle(17, 3);

        printTriangle(4);
    }

    public static void printStars(int number) {
        int counter = number;
        while (counter > 0) {
            System.out.print("*");
            counter--;
        }
        System.out.println("");
    }

    public static void printSquare(int number) {
        for (int i = number; i > 0; i--) {
            int counter = number;
            printStars(number);
        }
    }

    public static void printRectangle(int width, int height) {
        int counter = height;
        while (counter > 0) {
            printStars(width);
            counter--;
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;
        while (counter <= size) {
            printStars(counter);
            counter++;
        }
    }
}
