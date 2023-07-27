package Part_5.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What is the book title?");
        String title = reader.nextLine();
        System.out.println("What is the book's author?");
        String author = reader.nextLine();
        System.out.println("What is the page count of the book?");
        int page_count = Integer.valueOf(reader.nextLine());

        Book book = new Book(author, title, page_count);

        System.out.println(book);
    }
}
