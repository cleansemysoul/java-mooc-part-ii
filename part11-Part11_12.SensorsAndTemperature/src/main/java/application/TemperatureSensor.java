/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class TemperatureSensor implements Sensor {

    private boolean set;

    public TemperatureSensor() {
        this.set = false;
    }

    @Override
    public boolean isOn() {
        return this.set;
    }

    @Override
    public void setOn() {
        if (isOn() == false) {
            this.set = true;
        }
    }

    @Override
    public void setOff() {
        if (isOn()) {
            this.set = false;
        }
    }

    @Override
    public int read() {
        if (isOn()) {
            Random rand = new Random();
            int range = 30 - (-30) + 1;

            return rand.nextInt(range) + (-30);
        } else {
            throw new IllegalArgumentException("error reaging temp sens");
        }

    }
}
