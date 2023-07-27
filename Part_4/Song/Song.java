package Part_4.Song;

public class Song {
    private String name;
    private int length;

    public Song (String name, int length) {
        this.name = name;
        this.length = 0;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}
