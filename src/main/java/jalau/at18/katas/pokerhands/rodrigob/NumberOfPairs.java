package jalau.at18.katas.pokerhands.rodrigob;

public class NumberOfPairs extends CardsPattern {

    private int cardsWithPair;
    private int expectedNumberPairs;

    public NumberOfPairs(int expectedNumberPairs) {
        this.cardsWithPair = 0;
        this.expectedNumberPairs = expectedNumberPairs * 2;
    }

    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        countCardsWithPairs(hand, count);
        return this.cardsWithPair == this.expectedNumberPairs;
    }

    public void countCardsWithPairs(PokerHand hand, CardValuesCount count) {
        for (Card card : hand.getCards()) {
            if (count.get(card.getValue()) == 2) {
                this.cardsWithPair++;
            }
        }
    }

}
