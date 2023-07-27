package Part_3;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int name_length = 0;
        double sum = 0;
        double counter = 0;
        String longest_name = "";

        System.out.println("Enter names of people and ages separated by just a comma");

        while(true) {
            String sentence = reader.nextLine();

            if (sentence.equals("")) {
                break;
            }

            String[] words = sentence.split(",");
            int length = Integer.valueOf(words[0].length());
            String name = words[0];

            if (length > name_length) {
                longest_name = words[0];
            }

            sum += Double.valueOf(words[1]);
            counter++;
        }

        System.out.println("Longest name: " + longest_name);
        System.out.println("Average of the birth years: " + (sum / counter));
    }
}
