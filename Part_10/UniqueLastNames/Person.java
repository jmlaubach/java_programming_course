package Part_10.UniqueLastNames;

public class Person {
    private String firstname;
    private String lastName;
    private int birthYear;

    public Person(String firString, String lastName, int birthYear) {
        this.firstname = firString;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getBirthYear() {
        return this.birthYear;
    }
}
