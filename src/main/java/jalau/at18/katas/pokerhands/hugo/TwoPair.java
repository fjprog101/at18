package jalau.at18.katas.pokerhands.hugo;

public class TwoPair extends CardsPattern {

    private static final int CARDS_IN_PAIRS = 4;
    private static final int NUMBER_OF_PAIRS = 2;
    private int counterCardsWithPair;

    public TwoPair() {
        counterCardsWithPair = 0;
    }

    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        countCardsWithAPair(hand, count);
        return this.counterCardsWithPair == CARDS_IN_PAIRS;
    }

    public void countCardsWithAPair(PokerHand hand, CardValuesCount count) {
        for (Card card : hand.getCards()) {
            if (count.get(card.getValue()) == NUMBER_OF_PAIRS) {
                this.counterCardsWithPair++;
            }
        }
    }
}
