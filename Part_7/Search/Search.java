package Part_7.Search;

import java.util.ArrayList;

public class Search {
    private ArrayList<Book> books;

    public Search() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public int linearSearch(int searchedId) {
        for (int i = 0; i < this.books.size(); i++) {
            Book currentBook = this.books.get(i);
            if (currentBook.getId() == searchedId) {
                return i;
            }  
        }

        return -1;
    }

    public int binarySearch(int searchedId) {
        int end = this.books.size() - 1;
        int begin = 0;

        int middle = end / 2;
        
        while (begin < end) {
            Book currentBook = this.books.get(middle);
            if (currentBook.getId() == searchedId) {
                return middle;
            } else if (currentBook.getId() < searchedId) {
                middle = middle + 1;
            } else {
                middle = middle - 1;
            }
        }

        return -1;
    }
}
