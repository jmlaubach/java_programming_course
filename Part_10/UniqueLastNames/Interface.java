package Part_10.UniqueLastNames;

import java.util.Scanner;
import java.util.ArrayList;

public class Interface {
    private Scanner scanner;
    private ArrayList<Person> people;

    public Interface(Scanner scanner) {
        this.scanner = scanner;
        this.people = new ArrayList<>();
    }

    public void start() {
        while(true) {
            System.out.println("Continue personal information input? 'quit' ends: ");
            String toQuit = scanner.nextLine();

            if (toQuit.equals("quit")) {
                break;
            }

            System.out.print("Input first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Input last name: ");
            String lastname = scanner.nextLine();
            System.out.print("Input the year of birth: ");
            Integer birthYear = Integer.valueOf(scanner.nextLine());
            System.out.println("");

            Person person = new Person(firstName, lastname, birthYear);

            this.people.add(person);
        }

        System.out.println("Unique last names in alphabetical order:");
        this.people.stream()
            .map(person -> person.getLastName())
            .distinct()
            .sorted()
            .forEach(lName -> System.out.println(lName));
    }
}
