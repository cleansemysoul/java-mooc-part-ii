
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (items.keySet().contains(product)) {
            increaseQuantity(product);
        } else {
            this.items.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int sum = 0;
        for (Item e : items.values()) {
            sum += e.price();
        }
        return sum;
    }

    public void increaseQuantity(String product) {
        this.items.get(product).increaseQuantity();
    }

    public void print() {
        for (String e : items.keySet()) {
            System.out.println(items.get(e).toString());
        }
    }
}
