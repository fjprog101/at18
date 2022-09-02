package jalau.at18.katas.pokerhands.joseg;

public class CardsWithSameValue {

    private int expectedCount;

    public CardsWithSameValue(int expectedCount) {
        this.expectedCount = expectedCount;
    }

    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(expectedCount);
    }
}
