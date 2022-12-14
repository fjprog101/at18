package jalau.at18.katas.pokerhands.mauricio;

public class TwoPairsComparer {
    private PokerHandComparer comparer = new PokerHandComparer();
    private ThreeOfAKindComparer threeOfAKindComparer = new ThreeOfAKindComparer();

    public Boolean blackHandWInnerForTwoPairsCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (comparer.comparer(black, new TwoPairsIdentifier(value1, value2))
                && !comparer.comparer(white, new ThreeOfKindIdentifier(value1, value2))
                && !comparer.comparer(white, new StraightIdentifier())
                && !comparer.comparer(white, new FlushIdentifier())) ? true
                        : threeOfAKindComparer.blackHandWinnerForThreeOfAKindCase(black, white, value1, value2);
    }
}
