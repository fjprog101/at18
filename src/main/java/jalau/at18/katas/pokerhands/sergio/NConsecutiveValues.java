package jalau.at18.katas.pokerhands.sergio;

import java.util.ArrayList;
import java.util.List;

public class NConsecutiveValues extends CardsPattern {
    private CardComparer comparer;
    private int timesRepeated;
    private List<CardValue> pairList = new ArrayList<CardValue>();

    public NConsecutiveValues(int timesRepeated) {
        this.timesRepeated = timesRepeated;
        comparer = new CardComparer();
    }

    @Override
    public boolean match(PokerHand hand) {
        boolean areSameValueCard = true;
        for (int index = 0; index < hand.getCards().length - 1; index++) {
            areSameValueCard = comparer.haveSameValue(hand.getCards()[index], hand.getCards()[index + 1]);
            if (areSameValueCard) {
                if (pairList.contains(hand.getCards()[index].getValue())) {
                    pairList.add(hand.getCards()[index].getValue());
                }
                pairList.add(hand.getCards()[index].getValue());
            }
        }
        if (pairList.size() == timesRepeated) {
            return true;
        }
        return false;
    }
}
