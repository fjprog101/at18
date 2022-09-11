package jalau.at18.katas.pokerhands.mauricio;

public class StraightComparer {
    private PokerHandComparer comparer = new PokerHandComparer();
    private FlushComparer flushComparer = new FlushComparer();

    public Boolean straightCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (comparer.comparer(black, new StraightIdentifier())
                && !comparer.comparer(white, new FlushIdentifier())
                && !comparer.comparer(white, new FullHouseIdentifier(value1, value2))
                && !comparer.comparer(white, new FourOfAKindIdentifier(value1, value2))) ? true
                        : flushComparer.flushCase(black, white, value1, value2);
    }
}
