package Part_5.Books;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int totalBooks = 0;

        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop): ");
            String title = reader.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(reader.nextLine());

            Books book = new Books(title, pubYear);

            if (!(books.contains(book))) {
                books.add(book);
                totalBooks++;
            } else {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            }
        }

        System.out.println("Thank you! Books added: " + totalBooks);
    }
}
