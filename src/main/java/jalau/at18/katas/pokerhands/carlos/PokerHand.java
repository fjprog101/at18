package jalau.at18.katas.pokerhands.carlos;

import java.util.Arrays;

public class PokerHand {

    private Card[] cards;

    public PokerHand(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        Arrays.sort(cards, (a, b) -> b.getValue().compareTo(a.getValue()));
        return cards;
    }
}
