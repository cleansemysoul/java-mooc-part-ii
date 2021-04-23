/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public boolean isOn() {
        if (sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        return this.sensors.stream().allMatch(e -> e.isOn());
    }

    @Override
    public void setOn() {
        this.sensors.stream().forEach(e -> e.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.stream().forEach(e -> e.setOff());
    }

    @Override
    public int read() {
        if (!sensors.isEmpty() && isOn()) {
            int sum = 0;
            for (Sensor e : sensors) {
                sum += e.read();
            }
            int average = sum / sensors.size();
            readings.add(average);
            return average;
        } else {
            throw new IllegalStateException();
        }
    }
    
    public List<Integer> readings(){
        return readings;
    }
}
