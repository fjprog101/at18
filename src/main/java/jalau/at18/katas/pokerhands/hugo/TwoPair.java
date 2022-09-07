package jalau.at18.katas.pokerhands.hugo;

public class TwoPair extends CardsPattern {

    private static final int CARDS_WITH_A_PAIR = 4;
    private int cardsWithPairCounter;

    public TwoPair() {
        cardsWithPairCounter = 0;
    }

    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        countCardsWithAPair(hand, count);
        return this.cardsWithPairCounter == CARDS_WITH_A_PAIR;
    }

    public void countCardsWithAPair(PokerHand hand, CardValuesCount count) {
        for (Card card : hand.getCards()) {
            if (count.get(card.getValue()) == 2) {
                this.cardsWithPairCounter++;
            }
        }
    }
}
