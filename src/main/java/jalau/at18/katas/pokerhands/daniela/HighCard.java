package jalau.at18.katas.pokerhands.daniela;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighCard extends CardsPattern {
    private final int HighCard = 1;
    private char suit;

    public HighCard() {
        // this.value1 = value1;
        // this.value2 = value2;
    }

    @Override
    public boolean match(PokerHand handWith2PairsPerHand) {
        highCard(handWith2PairsPerHand);
        return highCard(handWith2PairsPerHand);
    }

    public boolean highCard(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount count = cardValuesCounter.getCount();
        return count.exists(HighCard) && count.exists(HighCard) && count.exists(HighCard) && count.exists(HighCard);
    }
    /*
     * public boolean oneHighCard(PokerHand hand) {
     * List<Card> cards = Arrays.asList(hand.getCards());
     * Collections.sort(cards);
     * boolean areConsecutive = true;
     * for (int index = 0; areConsecutive && index < cards.size() - 1; index++) {
     * areConsecutive = cards.get(4);
     * }
     * return areConsecutive;
     * }
     */
}
