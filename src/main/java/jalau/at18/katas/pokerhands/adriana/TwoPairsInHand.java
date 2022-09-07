package jalau.at18.katas.pokerhands.adriana;

public class TwoPairsInHand extends CardsPattern {

    public TwoPairsInHand() {

    }

    @Override
    public boolean match(PokerHand hand) {
        boolean haveTwoPairs = false;
        PairsCount pairsCount = new PairsCount(hand);
        if (pairsCount.get() == 2) {
            haveTwoPairs = true;
        }
        return haveTwoPairs;
    }
}
