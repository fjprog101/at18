package jalau.at18.katas.pokerhands.sarai;

import java.util.Arrays;

public class PokerHand {

    private Card[] cards;
    private Card[] nevo;

    public PokerHand(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        //Arrays.sort(cards, Collections.reverseOrder()); //recive un texto 12354  ->  54321
        Arrays.sort(cards,  (a, b) -> b.getValue().compareTo(a.getValue()));
        return cards;
    }
}
