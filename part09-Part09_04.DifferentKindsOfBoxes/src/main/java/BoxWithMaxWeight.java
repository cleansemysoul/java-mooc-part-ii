
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    public int current() {
        int sum = 0;
        for (Item e : items) {
            sum += e.getWeight();
        }
        return sum;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + current() <= maxWeight) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
