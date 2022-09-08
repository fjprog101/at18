package jalau.at18.katas.pokerhands.daniela;

public class Pairs extends CardsPattern {
    private static final int TOTAL_CARDS = 4;
    private int twoPairs;

    public Pairs() {
        this.twoPairs = 0;
    }

    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        twoPairs(hand, count);
        return this.twoPairs == TOTAL_CARDS;
    }

    public void twoPairs(PokerHand hand, CardValuesCount count) {
        for (Card card : hand.getCards()) {
            if (count.get(card.getValue()) == 2) {
                this.twoPairs++;
            }
        }
    }

}
