
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
public class OneItemBox extends Box {

    private ArrayList<Item> box;

    public OneItemBox() {
        this.box = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (box.isEmpty()) {
            box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return box.contains(item);
    }
}
