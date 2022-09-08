package jalau.at18.katas.pokerhands.daniela;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConsecutiveValues extends CardsPattern {

    private CardComparer comparer;

    public ConsecutiveValues() {
        this.comparer = new CardComparer();
    }

    @Override
    public boolean match(PokerHand hand) {
        boolean areConsecutive = true;
        List<Card> cards = Arrays.asList(hand.getCards());
        Collections.sort(cards);
        for (int index = 0; areConsecutive && index < cards.size() - 1; index++) {
            areConsecutive = comparer.areConsecutive(cards.get(index), cards.get(index + 1));
        }
        return areConsecutive;
    }

}
