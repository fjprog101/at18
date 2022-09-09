package jalau.at18.katas.pokerhands.joser;

public class PairPattern extends CardsPattern {
    private final int amountTwo = 2;

    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();

        return count.exists(amountTwo);
    }
}
