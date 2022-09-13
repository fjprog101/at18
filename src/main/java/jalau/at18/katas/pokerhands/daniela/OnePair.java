package jalau.at18.katas.pokerhands.daniela;

public class OnePair extends CardsPattern {
    private final int onepair = 2;
    private final int othercard = 1;
    private final int othercard2 = 3;

    public OnePair() {
    }

    @Override
    public boolean match(PokerHand handWith2PairsPerHand) {
        return onePairs(handWith2PairsPerHand);
    }

    public boolean onePairs(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount count = cardValuesCounter.getCount();
        return count.exists(onepair) && count.exists(othercard)
                && count.exists(othercard) != count.exists(onepair + othercard) != count
                        .exists(othercard2);
    }
}
