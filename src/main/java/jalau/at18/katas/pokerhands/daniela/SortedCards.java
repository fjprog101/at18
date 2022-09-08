package jalau.at18.katas.pokerhands.daniela;

import java.util.ArrayList;
import java.util.List;

public class SortedCards {
    private List<CardValue> sortedcards;

    public SortedCards() {
        sortedcards = new ArrayList<CardValue>();
    }

    public void add(CardValue cardValue) {
        if (sortedcards.contains(cardValue)) {
            sortedcards.add(cardValue);
        }
    }
    // Continue from here
}
