
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class ChangeHistory {

    private ArrayList<Double> changes;

    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }

    public void add(double status) {
        this.changes.add(status);
    }

    public void clear() {
        this.changes.clear();
    }

    public double maxValue() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        return Collections.max(changes);
    }

    public double minValue() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        return 1.0 * Collections.min(changes);
    }

    public double average() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double change : changes) {
            sum += change;
        }
        return 1.0 * sum / changes.size();
    }

    @Override
    public String toString() {
        return this.changes.toString();
    }
}
