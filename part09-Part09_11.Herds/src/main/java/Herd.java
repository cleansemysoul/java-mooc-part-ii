
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Herd implements Movable {

    private ArrayList<Movable> herds;

    public Herd() {
        this.herds = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herds.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable e : herds) {
            e.move(dx, dy);
        }
    }

    public String toString() {
        String string = "";
        for (Movable e : herds) {
            string += e.toString().trim() + "\n";
        }
        return string;
    }
}
