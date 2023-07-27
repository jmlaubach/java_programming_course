package Part_11.ValidatingParameters;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name.equals("") || name.equals(null) || name.length() > 40) {
            throw new IllegalArgumentException("Name cannot be empty or over 40 characters.");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
        this.name = name;
        this.age = age;
    }
}
