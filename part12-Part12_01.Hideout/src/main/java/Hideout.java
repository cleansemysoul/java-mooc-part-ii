
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
public class Hideout<T>{

    private List<T> hideout;

    public Hideout() {
        this.hideout = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        this.hideout.add(toHide);
    }

    public T takeFromHideout() {
        if (this.hideout.isEmpty()) {
            return null;
        }
        T toGet = this.hideout.get(0);
        this.hideout.clear();
        return toGet;
    }

    public boolean isInHideout() {
        if (this.hideout.isEmpty()) {
            return false;
        }
        return true;
    }
}
