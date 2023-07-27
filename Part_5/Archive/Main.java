package Part_5.Archive;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Archive> archiveItems = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = reader.nextLine();
            if (id.equals("")) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            }

            Archive item = new Archive(id, name);

            if (!(archiveItems.contains(item))) {
                archiveItems.add(item);
            }
        }

        System.out.println("==Items==");
        for (Archive i: archiveItems) {
            System.out.println(i);
        }
    }
}
