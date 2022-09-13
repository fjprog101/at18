package jalau.at18.katas.pokerhands.maria;

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
        List<Card> cards = Arrays.asList(hand.getCards());
        Collections.sort(cards);
        boolean areConsecutive = true;
        for (int index = 0; areConsecutive && index < cards.size() - 1; index++) {
            areConsecutive = comparer.areConsecutive(cards.get(index), cards.get(index + 1));
        }
        return areConsecutive;
    }

}
