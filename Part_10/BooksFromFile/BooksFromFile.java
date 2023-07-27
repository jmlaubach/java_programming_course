package Part_10.BooksFromFile;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;

public class BooksFromFile {
    public static void main(String[] args) {

        List<Book> books = readBooks("books.txt");

        for (Book b: books) {
            System.out.println(b.getAuthor());
        }
    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();

        try {
            Files.lines(Paths.get("Part_10/BooksFromFile/" + file))
                .map(row -> row.split(","))
                .filter(parts -> parts.length >= 4)
                .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                .forEach(book -> books.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return books;
    }
}
