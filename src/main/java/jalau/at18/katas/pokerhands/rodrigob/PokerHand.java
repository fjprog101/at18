package jalau.at18.katas.pokerhands.rodrigob;

import java.util.Collections;
import java.util.List;

public class PokerHand {

    private List<Card> cards;

    public PokerHand(List<Card> cards) {
        this.cards = cards;
        Collections.sort(cards);
    }

    public List<Card> getCards() {
        return cards;
    }
}
