package Part_4.TelevisionPrograms;

public class TelevisionPrograms {
    private String name;
    private int duration;

    public TelevisionPrograms(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public String toString() {
        return this.name + ", " + this.duration + " minutes.";
    }
}
