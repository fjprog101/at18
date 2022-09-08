package jalau.at18.katas.pokerhands.alvaro;

public class FourOfAKind extends CardsPattern {
    private int expectedCount;
    public FourOfAKind(int expectedCount) {
        this.expectedCount = expectedCount;
    }
    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(expectedCount);
    }
}
