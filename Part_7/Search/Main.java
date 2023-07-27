package Part_7.Search;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Search bookList = new Search();

        int id = 0;

        System.out.println("Input title of Books to create and add to list.");
        System.out.println("Hit enter on an empty line to finish adding books to list");

        while (true) {
            System.out.print("Title: ");
            String title = reader.nextLine();

            if (title.equals("")) {
                break;
            }

            Book book = new Book(id, title);

            bookList.addBook(book);

            id++;
        }

        System.out.println(bookList.binarySearch(2));
    }
}
