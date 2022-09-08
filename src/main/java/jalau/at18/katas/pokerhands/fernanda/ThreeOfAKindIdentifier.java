package jalau.at18.katas.pokerhands.fernanda;

public class ThreeOfAKindIdentifier extends Identifier {
    private final int three = 3;
    private final int one = 1;

    public boolean identify(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(three) && count.exists(one) && count.exists(one);
    }
    public RankHand getTypeofHand() {
        return RankHand.THREEOFAKIND;
    }
}
