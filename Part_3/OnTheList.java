package Part_3;

import java.util.Scanner;
import java.util.ArrayList;

public class OnTheList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Provide a list of names. Enter nothing to finish entering names in the list.");
        while (true) {            
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            } else {
                list.add(name);
            }
        }
        System.out.println("Search for? ");
        String name_choice = reader.nextLine();
        if (list.contains(name_choice)) {
            System.out.println(name_choice + " was found!");
        }
    }
}
