package Part_3;

import java.util.Scanner;

public class PrintThrice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give a word: ");

        String word = reader.nextLine();

        int counter = 1;
        while (counter <= 3) {
            System.out.print(word);
            counter++;
        }
    }
}
