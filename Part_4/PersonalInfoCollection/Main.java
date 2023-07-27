package Part_4.PersonalInfoCollection;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<PersonalInfoCollection> persons = new ArrayList<>();

        while (true) {
            System.out.print("First name: ");
            String f_name = reader.nextLine();

            if (f_name.equals("")) {
                break;
            }

            System.out.print("Last name: ");
            String l_name = reader.nextLine();

            System.out.print("Identification number: ");
            int id = Integer.valueOf(reader.nextLine());

            persons.add(new PersonalInfoCollection(f_name, l_name, id));
        }

        for (PersonalInfoCollection person: persons) {
            System.out.println(person);
        }
    }
}
