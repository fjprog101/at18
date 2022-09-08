package jalau.at18.katas.pokerhands.fernanda;

public class FourOfAKindIdentifier extends Identifier {
    private final int four = 4;
    private final int one = 1;

    public boolean identify(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(four) && count.exists(one);
    }
    public RankHand getTypeofHand() {
        return RankHand.FOUROFAKIND;
    }
}
