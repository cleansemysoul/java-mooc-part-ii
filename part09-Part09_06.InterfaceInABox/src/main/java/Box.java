
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Box implements Packable {

    private double maxWeight;
    private ArrayList<Packable> items;

    public Box(double weight) {
        this.maxWeight = weight;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (item.weight() + weight() <= this.maxWeight) {
            items.add(item);
        }
    }

    @Override
    public double weight() {
        double sum = 0;
        for (Packable e : items) {
            sum += e.weight();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }

}
