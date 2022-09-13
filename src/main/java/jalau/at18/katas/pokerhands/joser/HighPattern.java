package jalau.at18.katas.pokerhands.joser;

public class HighPattern extends CardsPattern {
    private final int amountTwo = 5;

    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();

        return count.exists(amountTwo);
    }
}
