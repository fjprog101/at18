package jalau.at18.katas.pokerhands.rodrigob;

public class TwoPairs extends CardsPattern {
    private static final int NUMBER_OF_CARDS_WITH_PAIRS = 4;
    private int cardsWithPair;

    public TwoPairs() {
        this.cardsWithPair = 0;
    }

    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        countCardsWithPairs(hand, count);
        return this.cardsWithPair == NUMBER_OF_CARDS_WITH_PAIRS;
    }

    public void countCardsWithPairs(PokerHand hand, CardValuesCount count) {
        for (Card card : hand.getCards()) {
            if (count.get(card.getValue()) == 2) {
                this.cardsWithPair++;
            }
        }
    }

}
