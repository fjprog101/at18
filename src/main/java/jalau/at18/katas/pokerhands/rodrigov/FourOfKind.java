package jalau.at18.katas.pokerhands.rodrigov;

public class FourOfKind extends CardsPattern {
    private final int cardsWithSameValue = 4;
    private final int otherCardsWithDiferentValue = 1;

    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(cardsWithSameValue) && count.exists(otherCardsWithDiferentValue);
    }
}
