package jalau.at18.katas.pokerhands.rodrigob.CardsPatterns;

import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class CardsWithSameValue extends CardsPattern {

    private int expectedCount;

    public CardsWithSameValue(int expectedCount) {
        this.expectedCount = expectedCount;
    }

    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(expectedCount);
    }
}
