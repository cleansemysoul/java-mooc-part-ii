
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionnary;

    public DictionaryOfManyTranslations() {
        this.dictionnary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionnary.putIfAbsent(word, new ArrayList<String>());
        this.dictionnary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.dictionnary.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        this.dictionnary.remove(word);
    }
}
