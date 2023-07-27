package Part_3;

import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int highest_age = 0;

        System.out.println("Enter names of people and ages separated by just a comma");

        while(true) {
            String sentence = reader.nextLine();

            if (sentence.equals("")) {
                break;
            }
            
            String[] words = sentence.split(",");
            int age = Integer.valueOf(words[1]);

            if (age > highest_age) {
                highest_age = age;
            }
        }

        System.out.println("Age of the oldest: " + highest_age);
    }
}