package Part_3;

import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(true) {
            String sentence = reader.nextLine();

            if (sentence.equals("")) {
                break;
            } else {
                String[] words = sentence.split(" ");
                System.out.println(words[0]);
            }
        }
    }
}
