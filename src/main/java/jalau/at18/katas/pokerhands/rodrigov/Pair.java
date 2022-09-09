package jalau.at18.katas.pokerhands.rodrigov;

public class Pair extends CardsPattern {
    private final int twoCardsWithSameValue = 2;
    private final int firstCard = 1;
    private final int secondCard = 1;
    private final int thirdCard = 1;

    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount count = cardValuesCounter.getCount();
        return count.exists(twoCardsWithSameValue) && count.exists(firstCard) && count.exists(secondCard) && count.exists(thirdCard);
    }
}
