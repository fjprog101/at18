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
            index += isItAPAir(hand, index);
        }
        return pairCounter == 2;
    }

    public int isItAPAir(PokerHand hand, int index) {
        if (comparer.haveSameValue(hand.getCards()[index], hand.getCards()[index + 1])) {
            pairCounter += 1;
            return 1;
        }
        return 0;
    }
}
