package jalau.at18.katas.pokerhands.mauricio;

public class PairComparer {
    private PokerHandComparer comparer = new PokerHandComparer();
    private TwoPairsComparer twoPairsComparer = new TwoPairsComparer();

    public Boolean blackHandWinnerForPairCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (comparer.comparer(black, new PairIdentifier(value1, value2))
                && !comparer.comparer(white, new TwoPairsIdentifier(value1, value2))
                && !comparer.comparer(white, new ThreeOfKindIdentifier(value1, value2))
                && !comparer.comparer(white, new StraightFlushIdentifier())) ? true
                        : twoPairsComparer.blackHandWInnerForTwoPairsCase(black, white, value1, value2);
    }
}
