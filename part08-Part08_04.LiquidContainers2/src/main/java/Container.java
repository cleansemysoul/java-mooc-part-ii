/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Container {

    private int container;

    public Container() {
        container = 0;
    }

    public void add(int amount) {
        if (amount > 0) {
            container += amount;
            if (container > 100) {
                container = 100;
            }
        }
    }

    public int contains() {
        return container;
    }

    public void remove(int amount) {
        if (amount > 0) {
            container -= amount;
            if (container < 0) {
                container = 0;
            }
        }
    }

    public String toString() {
        return container+"/100";
    }
}
