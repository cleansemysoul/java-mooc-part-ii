/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class CustomTacoBox implements TacoBox {

    private int tacosAmount;

    public CustomTacoBox(int tacos) {
        this.tacosAmount = tacos;
    }

    public int tacosRemaining() {
        return this.tacosAmount;
    }

    public void eat() {
        if (this.tacosAmount > 0) {
            this.tacosAmount -= 1;
        }
    }
}
