package jalau.at18.katas.pokerhands.fernanda;

public class TwoPairs extends CardsPattern {
    private CardComparer comparer;
    private int pairCounter;

    public TwoPairs() {
        this.comparer = new CardComparer();
    }

    @Override
    public boolean match(PokerHand hand) {
        for (int index = 0; index < hand.getCards().length - 1; index++) {
            isItAPAir(hand, index);
        }
        return pairCounter == 2;
    }

    public void isItAPAir(PokerHand hand, int index) {
        if (comparer.haveSameValue(hand.getCards()[index], hand.getCards()[index + 1])) {
            pairCounter += 1;
        }
    }
}
