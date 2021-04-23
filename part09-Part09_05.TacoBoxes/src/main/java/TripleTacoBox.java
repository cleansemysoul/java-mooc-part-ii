/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TripleTacoBox implements TacoBox {

    private int tacosAmount;

    public TripleTacoBox() {
        this.tacosAmount = 3;
    }

    @Override
    public int tacosRemaining() {
        return this.tacosAmount;
    }

    @Override
    public void eat() {
        if (this.tacosAmount > 0) {
            this.tacosAmount--;
        }
    }
}
