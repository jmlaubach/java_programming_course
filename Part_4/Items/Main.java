package Part_4.Items;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Items> items = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            }

            items.add(new Items(name));
        }

        for (Items item: items) {
            System.out.println(item);
        }
    }
}
