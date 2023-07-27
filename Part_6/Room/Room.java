package Part_6.Room;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        if (this.people.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }

        Person returnPerson = this.people.get(0);

        for (Person p: this.people) {
            if (returnPerson.getHeight() > p.getHeight()) {
             returnPerson = p;
            }
        }

        return returnPerson;
    }

    public Person take() {
        Person shortest = shortest();
        
        for (Person p: people) {
            if (shortest.equals(p)) {
                people.remove(p);
            }
        }

        return shortest;
    }
}
