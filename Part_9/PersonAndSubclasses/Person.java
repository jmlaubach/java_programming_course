package Part_9.PersonAndSubclasses;

public class Person {
    private String fullName;
    private String address;

    public Person(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }

    public String toString() {
        return this.fullName + "\n  " + this.address;
    }
}
