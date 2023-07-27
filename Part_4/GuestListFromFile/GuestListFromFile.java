package Part_4.GuestListFromFile;

import java.util.Scanner;
import java.nio.file.Paths;

public class GuestListFromFile {
    public static void main(String[] args) {
        Scanner file_reader = new Scanner(System.in);

        System.out.println("Enter names to check if they are on the guest list. Empty quits: ");

        while (true) {
            try (Scanner scanner = new Scanner(Paths.get("Part_4/GuestListFromFile/guestlist.txt"))) {

                String name = file_reader.nextLine();

                String row = scanner.nextLine();

                if (name.equals("")) {
                    break;
                } else if (row.equals(name)) {
                    System.out.println("The name is on the list");
                } else {
                    System.out.println("The name is not on the list.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Thank you!");
    }
}
