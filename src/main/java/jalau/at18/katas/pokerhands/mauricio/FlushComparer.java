package jalau.at18.katas.pokerhands.mauricio;

public class FlushComparer {
    private PokerHandComparer comparer = new PokerHandComparer();
    private FullHouseComparer fullHouseComparer = new FullHouseComparer();

    public Boolean blackHandWinnerForFlushCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (comparer.comparer(black, new FlushIdentifier())
                && !comparer.comparer(white, new FullHouseIdentifier(value1, value2))
                && !comparer.comparer(white, new FourOfAKindIdentifier(value1, value2))
                && !comparer.comparer(white, new StraightFlushIdentifier())) ? true
                        : fullHouseComparer.blackHandWInnerForFullHouseCase(black, white, value1, value2);
    }
}
