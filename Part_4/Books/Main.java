package Part_4.Books;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = reader.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(reader.nextLine());
            System.out.print("Publication year: ");
            int pub_year = Integer.valueOf(reader.nextLine());

            books.add(new Books(title, pages, pub_year));
        }

        System.out.println();
        System.out.print("What information will be printed? ");
        String info_request = reader.nextLine();

        if (info_request.equals("everything")) {
            for (Books book: books) {
                book.printEverything();
            }
        }

        if (info_request.equals("name")) {
            for (Books book: books) {
                book.printTitle();
            }
        }

    }
}
