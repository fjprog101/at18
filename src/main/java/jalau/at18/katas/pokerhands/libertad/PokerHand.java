package jalau.at18.katas.pokerhands.libertad;

import java.util.Collections;
import java.util.List;

public class PokerHand {

    private List<Card> cards;

    public PokerHand(List<Card> cards) {
        this.cards = cards;
        Collections.sort(cards, new CardOrder());
    }

    public List<Card> getCards() {
        return cards;
    }
}
