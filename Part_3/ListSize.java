package Part_3;

import java.util.Scanner;
import java.util.ArrayList;

public class ListSize {
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
        int get_size = list.size();
        System.out.println("List item total: " + get_size);
    }
}
