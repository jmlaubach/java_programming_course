package Part_5.Counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(2);

        System.out.println(counter.value());

        counter.increase();
        counter.increase(4);
        counter.decrease();

        System.out.println(counter.value());

        counter.decrease(3);
        counter.increase();

        System.out.println(counter.value());
    }
}
