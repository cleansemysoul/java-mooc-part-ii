/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(file)).map(e -> e.split(":")).forEach(i -> {
                dictionary.put(i[0], i[1]);
                dictionary.put(i[1], i[0]);
            });
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String words, String translation) {
        if (dictionary.containsKey(words)) {
            return;
        }
        this.dictionary.put(words, translation);
        this.dictionary.put(translation, words);
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new File(file));
            saveWords(writer);
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private void saveWords(PrintWriter writer) throws IOException {
        List<String> allreadySaved = new ArrayList<>();
        dictionary.keySet().stream().forEach(word -> {
            if (allreadySaved.contains(word)) {
                return;
            }
            String pari = word + ":" + dictionary.get(word);
            writer.println(pari);
            allreadySaved.add(word);
            allreadySaved.add(dictionary.get(word));
        });
    }

    public void delete(String word) {
        String translation = this.dictionary.get(word);
        this.dictionary.remove(word);
        this.dictionary.remove(translation);
    }

    public String translate(String word) {
        return this.dictionary.get(word);
    }

}
