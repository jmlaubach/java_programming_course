package Part_5.Product;

public class Main {
    public static void main(String[] args) {
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tire = new Product("Tire", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tire);
    }
}
