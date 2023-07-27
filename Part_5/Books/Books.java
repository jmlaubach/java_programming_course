package Part_5.Books;

public class Books {
    private String title;
    private int pubYear;

    public Books (String title, int pubYear) {
        this.title = title;
        this.pubYear = pubYear;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Books)) {
            return false;
        }

        Books comparedBook = (Books) compared;

        if (this.title.equals(comparedBook.title) && this.pubYear == comparedBook.pubYear) {
            return true;
        }

        return false;
    }
}
