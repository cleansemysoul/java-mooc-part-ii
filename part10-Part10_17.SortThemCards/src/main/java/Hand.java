
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public int getValue() {
        return this.cards.stream().map(e -> e.getValue()).reduce(0, (a, b) -> a + b);
    }

    public void print() {
        this.cards.stream().forEach(e -> System.out.println(e));
    }

    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand hand) {
        return this.getValue() - hand.getValue();
    }

    public void sortBySuit() {
        BySuitInValueOrder sort = new BySuitInValueOrder();
        Collections.sort(cards, sort);
    }
}
