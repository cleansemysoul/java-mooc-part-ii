/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ProductWarehouse extends Warehouse {

    private String product;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.product = productName;
    }

    public void setName(String newName) {
        this.product = newName;
    }

    public String getName() {
        return this.product;
    }

    @Override
    public String toString() {
        return getName() + ": balance = " + super.getBalance() + ", space left " + super.howMuchSpaceLeft();
    }
}
