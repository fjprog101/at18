package jalau.at18.katas.pokerhands.rodrigov;

public class FullHouse extends CardsPattern {
    private final int threeCardsWithSameValue = 3;
    private final int twoCardsWithSameValue = 2;

    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount count = cardValuesCounter.getCount();
        return count.exists(threeCardsWithSameValue) && count.exists(twoCardsWithSameValue);
    }
}
