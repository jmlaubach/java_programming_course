package Part_10.EnumAndIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    private ArrayList<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person p: peopleToAdd) {
            this.persons.add(p);
        }
    }

    public void fire(Education education) {
        Iterator<Person> iteratorFire = persons.iterator();

        while(iteratorFire.hasNext()) {
            if (iteratorFire.next().getEducation().equals(education)) {
                iteratorFire.remove();
            }
        }
    }

    public void print() {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            System.out.println(nextPerson);
        }
    }

    public void print(Education education) {
        Iterator<Person> iteratorEdu = persons.iterator();

        while(iteratorEdu.hasNext()) {
            Person nextPerson = iteratorEdu.next();
            if (iteratorEdu.next().getEducation().equals(education)) {
                System.out.println(nextPerson);
            }
        }
    }
}
