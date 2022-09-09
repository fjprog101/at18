package jalau.at18.katas.pokerhands.alvaro;

public class TwoPair extends CardsPattern {
    private static final int EXPECTED_COUNT_PAIR = 2;
    private static final int COUNT_PAIRS = 2;
    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        if (count.getCont() == COUNT_PAIRS) {
            return count.exists(EXPECTED_COUNT_PAIR);
        } else {
            return false;
        }
    }
}
