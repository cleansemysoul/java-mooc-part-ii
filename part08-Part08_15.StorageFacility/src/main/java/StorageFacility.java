
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnit;

    public StorageFacility() {
        this.storageUnit = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageUnit.putIfAbsent(unit, new ArrayList<>());
        this.storageUnit.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageUnit.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        this.storageUnit.get(storageUnit).remove(item);
        if (this.storageUnit.get(storageUnit).isEmpty()) {
            this.storageUnit.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String e : this.storageUnit.keySet()) {
            units.add(e);
        }
        return units;
    }

}
