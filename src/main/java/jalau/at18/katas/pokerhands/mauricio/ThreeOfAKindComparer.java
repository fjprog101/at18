package jalau.at18.katas.pokerhands.mauricio;

public class ThreeOfAKindComparer {
    private PokerHandComparer comparer = new PokerHandComparer();
    private StraightComparer straightComparer = new StraightComparer();

    public Boolean blackHandWinnerForThreeOfAKindCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (comparer.comparer(black, new ThreeOfKindIdentifier(value1, value2))
                && !comparer.comparer(white, new StraightFlushIdentifier())
                && !comparer.comparer(white, new FlushIdentifier())
                && !comparer.comparer(white, new FullHouseIdentifier(value1, value2))) ? true
                        : straightComparer.blackHandWinnerForStraightCase(black, white, value1, value2);
    }
}
