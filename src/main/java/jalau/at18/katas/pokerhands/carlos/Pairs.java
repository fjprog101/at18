package main.java.jalau.at18.katas.pokerhands.carlos;

import jalau.at18.katas.pokerhands.carlos.CardComparer;
import jalau.at18.katas.pokerhands.carlos.PokerHand;

public class Pairs {
    private static int count = 0;
    public Pairs() {
    }

    public boolean identifyPairs(PokerHand hand) {
        boolean twoPairsIndentifier = false;
        CardComparer comparer = new CardComparer();
        count = pairsCounter(hand, comparer);
        if (count == 2) {
            twoPairsIndentifier = true;
        }
        return twoPairsIndentifier;
    }

    private static int pairsCounter(PokerHand hand, CardComparer comparer) {
        for (int index = 0; index < hand.getCards().length - 1; index++) {
            if (comparer.haveSameValue(hand.getCards()[index], hand.getCards()[index + 1])) {
                count++;
                index++;
            }
        }
        return count;
    }
}
