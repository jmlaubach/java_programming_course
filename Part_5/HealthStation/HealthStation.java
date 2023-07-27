package Part_5.HealthStation;

public class HealthStation {
    private String name;
    private int weighings;
    
    public HealthStation() {
        this.name = "Health Station";
        this.weighings = 0;
    }

    public int weigh(Person person) {
        this.weighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight((person.getWeight() + 1));
    }

    public int weighings() {
        return this.weighings;
    }
}
