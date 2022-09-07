package jalau.at18.katas.pokerhands.fernanda;

public class ThreeOFAKind extends CardsPattern {
    private CardComparer comparer;

    private int counter = 1;
    private static final int THREE = 3;

    public ThreeOFAKind() {
        this.comparer = new CardComparer();
    }

    @Override
    boolean match(PokerHand hand) {
        for (int index = 0; counter < THREE && index < hand.getCards().length - 1; index++) {
            hasSameValue(hand, index);
        }
        return counter == THREE;
    }

    public void hasSameValue(PokerHand hand, int index) {
        if (comparer.haveSameValue(hand.getCards()[index], hand.getCards()[index + 1])) {
            counter += 1;
        }
    }
}
