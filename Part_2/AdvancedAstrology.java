package Part_2;

import java.util.Scanner;

public class AdvancedAstrology {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        printTriangle(4);

        System.out.println("What is the height of your Christmas Tree?");
        int tree_height = Integer.valueOf(reader.nextLine());

        christmasTree(tree_height);
    }

    public static void printStars(int number) {
        int counter = number;
        while (counter > 0) {
            System.out.print("*");
            counter--;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int counter = number;
        while (counter > 0) {
            System.out.print(" ");
            counter--;
        }
    }

    public static void printTriangle(int size) {
        int start = (size - 1);
        int counter = 1;
        while (counter <= size) {
            printSpaces(start);
            printStars(counter);
            start--;
            counter++;
        }
    }

    public static void christmasTree(int height) {
        int spaces = (height - 1);
        int stars = 1;
        int trunk_spacing = (height - 2);
        
        while (spaces >= 0) {
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars += 2;
        } 

        printSpaces(trunk_spacing);
        printStars(3);;
        printSpaces(trunk_spacing);
        printStars(3);
    }
}
