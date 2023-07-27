package Part_9.Warehouse;

public class ProductWarehouse extends Warehouse{
    private String product;
    
    public ProductWarehouse(String product, double capacity) {
        super(capacity);
        this.product = product;
    }

    public String getName() {
        return this.product;
    }

    public String toString() {
        return this.product + ": " + super.toString();
    }
}
