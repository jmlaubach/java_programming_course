package Part_3;

import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(true) {
            String sentence = reader.nextLine();

            if (sentence.equals("")) {
                break;
            } else {
                String[] words = sentence.split(" ");

                for (int i = 0; i < words.length; i++) {
                    System.out.println(words[i]);
                }
            }
        }
    }
}
