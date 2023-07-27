package Part_3;

import java.util.Scanner;
import java.util.ArrayList;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> name_list = new ArrayList<>();
        System.out.println("Provide names to add to a list: ");

        while(true) {
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            } else {
                name_list.add(name);
            }
        }
        System.out.println(name_list.get(2));
    }
}
