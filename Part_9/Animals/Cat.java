package Part_9.Animals;

public class Cat extends Animal implements NoiseCapable{
    public Cat() {
        super("Cat");
    }

    public Cat(String name) {
        super(name);
    }

    public void purr() {
        System.out.println(super.getName() + " purrs");
    }

    public void makeNoise() {
        this.purr();
    }
}