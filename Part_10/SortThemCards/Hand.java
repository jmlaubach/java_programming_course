package Part_10.SortThemCards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void sort() {
        Comparator<Card> comparator = Comparator
            .comparing(Card::getValue)
            .thenComparing(Card::getSuit);

        Collections.sort(this.hand, comparator);
    }

    public void print() {
        Iterator<Card> iterator = hand.iterator();

        while (iterator.hasNext()) {
            Card nextCard = iterator.next();
            System.out.println(nextCard);
        }
    }

    @Override
    public int compareTo(Hand handCompare) {
        int thisValue = this.hand.stream()
            .map(card -> card.getValue())
            .reduce(0, (a, b) -> a + b);
        int otherValue = handCompare.hand.stream()
            .map(card -> card.getValue())
            .reduce(0, (a, b) -> a + b);

        return thisValue - otherValue;

    }
}
