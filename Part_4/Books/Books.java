package Part_4.Books;

public class Books {
    private String title;
    private int pages;
    private int publication_year;

    public Books(String title, int pages, int publication_year) {
        this.title = title;
        this.pages = pages;
        this.publication_year = publication_year;
    }

    public void printEverything() {
        System.out.println(this.title + ", " + this.pages + " pages, " + this.publication_year);
    }

    public void printTitle() {
        System.out.println(this.title);
    }
}
