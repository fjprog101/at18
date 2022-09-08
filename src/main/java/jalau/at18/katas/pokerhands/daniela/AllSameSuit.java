package jalau.at18.katas.pokerhands.daniela;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllSameSuit extends CardsPattern {

    private CardComparer comparer;

    public AllSameSuit() {
        this.comparer = new CardComparer();
    }

    @Override
    public boolean match(PokerHand hand) {
        List<Card> cards = Arrays.asList(hand.getCards());
        Collections.sort(cards);
        boolean areSameSuit = true;
        for (int index = 0; areSameSuit && index < cards.size() - 1; index++) {
            areSameSuit = comparer.haveSameSuit(cards.get(index), cards.get(index + 1));
        }
        return areSameSuit;
    }

}
