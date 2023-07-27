package Part_4.PersonalInfoCollection;

public class PersonalInfoCollection {
    private String first_name;
    private String last_name;
    private int id;

    public PersonalInfoCollection(String first_name, String last_name, int id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.id = id;
    }

    public String toString() {
        return this.first_name + " " + this.last_name;
    }
}
