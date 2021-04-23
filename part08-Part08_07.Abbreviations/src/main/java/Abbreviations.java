
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
public class Abbreviations {

    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explenation) {
        this.abbreviations.put(sanitazedString(abbreviation), explenation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(sanitazedString(abbreviation));
    }

    public String sanitazedString(String string) {
        if (string == null) {
            return "";
        }
        return string.toLowerCase().trim();
    }
}
