package Part_5.Archive;

public class Archive {
    private String id;
    private String name;

    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedItem = (Archive) compared;

        if (this.id.equals(comparedItem.id)) {
            return true;
        }

        return false;
    }

    public String toString() {
        return (this.id + ": " + this.name);
    }
}
