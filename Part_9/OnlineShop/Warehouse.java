package Part_9.OnlineShop;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {
    private Map<String, Integer> warehousePrice;
    private Map<String, Integer> warehouseStock;

    public Warehouse() {
        this.warehousePrice = new HashMap<>();
        this.warehouseStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.warehousePrice.put(product, price);
        this.warehouseStock.put(product, stock);
    }

    public boolean take(String product) {
        if (this.warehouseStock.containsKey(product)) {
            boolean stockAboveZero = this.warehouseStock.get(product) > 0;

            if (stockAboveZero) {
                this.warehouseStock.put(product, this.warehouseStock.get(product) - 1);
                return true;
            }

            return false;
        } else {
            return false;
        }
    }

    public int price(String product) {
        if (this.warehousePrice.containsKey(product)) {
            return this.warehousePrice.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (this.warehouseStock.containsKey(product)) {
            return this.warehouseStock.get(product);
        } else {
            return 0;
        }
    }

    public Set<String> products() {
        Set<String> productNames = new HashSet<>();

        for (String product: this.warehousePrice.keySet()) {
            productNames.add(product);
        }

        return productNames;
    }
}
