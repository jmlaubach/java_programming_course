package Part_10.Literature;

public class Book {
    private String title;
    private int ageRecommendation;

    public Book(String title, int ageRecommendation) {
        this.title = title;
        this.ageRecommendation = ageRecommendation;
    }

    public String getTitle() {
        return this.title;
    }

    public int getAgeRecommendation() {
        return this.ageRecommendation;
    }

    public String toString() {
        return this.title + " (recommended for " + this.ageRecommendation + " year-olds or older)";
    }
}
