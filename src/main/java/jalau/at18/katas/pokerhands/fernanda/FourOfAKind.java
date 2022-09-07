package jalau.at18.katas.pokerhands.fernanda;

public class FourOfAKind extends CardsPattern {
    private CardComparer comparer;

    private int counter = 1;
    private static final int FOUR = 4;

    public FourOfAKind() {
        this.comparer = new CardComparer();
    }

    @Override
    boolean match(PokerHand hand) {
        for (int index = 0; counter < FOUR && index < hand.getCards().length - 1; index++) {
            hasSameValue(hand, index);
        }
        return counter == FOUR;
    }

    public void hasSameValue(PokerHand hand, int index) {
        if (comparer.haveSameValue(hand.getCards()[index], hand.getCards()[index + 1])) {
            counter += 1;
        }
    }
}
