package Part_9.PersonAndSubclasses;

public class Teacher extends Person{
    private int salary;

    public Teacher(String fullName, String address, int salary) {
        super(fullName, address);
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euro/month";
    }
}
