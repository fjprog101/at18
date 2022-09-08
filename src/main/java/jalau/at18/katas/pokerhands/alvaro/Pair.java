package jalau.at18.katas.pokerhands.alvaro;

public class Pair extends CardsPattern {
    private static final int EXPECTED_COUNT = 2;
    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(EXPECTED_COUNT);
    }

}
