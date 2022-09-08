package jalau.at18.katas.pokerhands.fernanda;

public class FullHouseIdentifier extends Identifier {
    private final int three = 3;
    private final int two = 2;

    public boolean identify(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(three) && count.exists(two);
    }
    public RankHand getTypeofHand() {
        return RankHand.FULLHOUSE;
    }
}
