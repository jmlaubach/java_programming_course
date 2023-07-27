package Part_5.Book;

public class Book {
    private String author;
    private String title;
    private int page_count;

    public Book(String author, String title, int page_count) {
        this.author = author;
        this.title = title;
        this.page_count = page_count;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.title;
    }

    public int getPages() {
        return this.page_count;
    }

    public String toString() {
        return this.author + ", " + this.title + ", " + this.page_count + " pages";
    }
}
