package jalau.at18.katas.pokerhands.sarai;

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
