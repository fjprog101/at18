package jalau.at18.katas.pokerhands.hugo;

public class PairsNumber extends CardsPattern {

    private int pairs;
    private int cardsInPairs;

    public PairsNumber(int pairsNeeded) {
        this.pairs = 0;
        this.cardsInPairs = pairsNeeded * 2;
    }

    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        countCardPairs(hand, count);
        return this.pairs == this.cardsInPairs;
    }

    public void countCardPairs(PokerHand hand, CardValuesCount count) {
        for (Card card : hand.getCards()) {
            if (count.get(card.getValue()) == 2) {
                this.pairs++;
            }
        }
    }
}
