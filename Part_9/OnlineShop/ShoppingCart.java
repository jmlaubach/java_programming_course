package Part_9.OnlineShop;

import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        Item item = new Item(product, 1, price);

        if (this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
        } else {
            this.cart.put(product, item);
        }
    }

    public int price() {
        int totalPrice = 0;

        for (Item i: this.cart.values()) {
            totalPrice += i.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item i: this.cart.values()) {
            System.out.println(i);
        }
    }
}
