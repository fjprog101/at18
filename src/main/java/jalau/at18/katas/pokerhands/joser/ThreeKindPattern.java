package jalau.at18.katas.pokerhands.joser;

public class ThreeKindPattern extends CardsPattern {
    private final int amountOfCartas = 3;

    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(amountOfCartas);
    }
}
