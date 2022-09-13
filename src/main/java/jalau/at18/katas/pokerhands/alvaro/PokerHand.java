package jalau.at18.katas.pokerhands.alvaro;
import java.util.Arrays;
import java.util.Collections;
public class PokerHand {

    private Card[] cards;
    public PokerHand(Card[] cards) {
        this.cards = cards;
    }
    public Card[] getCards() {
        Arrays.sort(cards, (a, b) -> a.getValue().compareTo(b.getValue()));
        Collections.reverse(Arrays.asList(cards));
        return cards;
    }
}
