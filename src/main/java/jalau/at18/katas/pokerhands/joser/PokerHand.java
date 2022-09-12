package jalau.at18.katas.pokerhands.joser;
import java.util.Arrays;

public class PokerHand {

    private Card[] cards;


    public PokerHand(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        Arrays.sort(cards, (cartaA, cartaB) -> cartaB.getValue().compareTo(cartaA.getValue()));
        return cards;
    }

  
}
