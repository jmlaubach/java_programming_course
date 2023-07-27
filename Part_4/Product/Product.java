package Part_4.Product;

public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String inititalName, double initialPrice, int initialQuantity) {
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = inititalName;
    }

    public void printProduct() {
        System.out.print(this.name + ", ");
        System.out.print("price " + this.price + ", ");
        System.out.print(this.quantity + " pcs");
    }
}
