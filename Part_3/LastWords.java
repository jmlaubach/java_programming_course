package Part_3;

import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(true) {
            String sentence = reader.nextLine();

            if (sentence.equals("")) {
                break;
            } else {
                String[] words = sentence.split(" ");
                int last_index = words.length - 1;
                System.out.println(words[last_index]);
            }
        }
    }
}