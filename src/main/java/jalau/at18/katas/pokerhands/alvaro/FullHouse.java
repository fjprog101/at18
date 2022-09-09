package jalau.at18.katas.pokerhands.alvaro;

public class FullHouse extends CardsPattern {
    private static final int EXPECTED_COUNT = 3;
    private static final int EXPECTED_COUNT_PAIR = 2;
    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(EXPECTED_COUNT_PAIR) && count.exists(EXPECTED_COUNT);
    }
}
