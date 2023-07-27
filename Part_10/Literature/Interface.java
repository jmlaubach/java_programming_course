package Part_10.Literature;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Interface {
    private Scanner scanner;
    private ArrayList<Book> books;

    public Interface(Scanner scanner) {
        this.scanner = scanner;
        this.books = new ArrayList<>();
    }

    public void start() {
        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());

            Book newBook = new Book(title, ageRecommendation);
            this.books.add(newBook);

            System.out.println("");
        }
        
        System.out.println("");
        System.out.println(this.books.size() + " books in total");
        System.out.println("");
        System.out.println("Books:");

        Comparator<Book> comparator = Comparator
            .comparing(Book::getAgeRecommendation)
            .thenComparing(Book::getTitle);
        
        Collections.sort(this.books, comparator);

        for (Book b: this.books) {
            System.out.println(b);
        }
    }
}
