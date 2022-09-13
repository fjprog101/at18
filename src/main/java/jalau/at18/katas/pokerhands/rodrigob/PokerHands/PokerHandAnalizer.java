package jalau.at18.katas.pokerhands.rodrigob.PokerHands;

import jalau.at18.katas.pokerhands.rodrigob.CardsPatterns.CardsPattern;

public class PokerHandAnalizer {

    public boolean analize(PokerHand hand, CardsPattern pattern) {
        return pattern.match(hand);
    }
}
