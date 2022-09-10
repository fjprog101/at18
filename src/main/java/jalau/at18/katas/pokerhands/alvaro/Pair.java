package jalau.at18.katas.pokerhands.alvaro;

public class Pair extends CardsPattern {
    private static final int EXPECTED_COUNT = 2;
    private static final int EXPECTED_COUNT3 = 3;
    private static final int COUNT_PAIRS = 2;

    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        if (count.getCont() != COUNT_PAIRS) {
            return count.exists(EXPECTED_COUNT) && !count.exists(EXPECTED_COUNT3);
        }
        return false;
    }
}
