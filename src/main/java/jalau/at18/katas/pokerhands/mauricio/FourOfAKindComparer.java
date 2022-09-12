package jalau.at18.katas.pokerhands.mauricio;

public class FourOfAKindComparer {
    private PokerHandComparer comparer = new PokerHandComparer();
    private StraightFlushComparer straightFlushComparer = new StraightFlushComparer();

    public Boolean blackHandWinnerForFourOfAKindCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (comparer.comparer(black, new FourOfAKindIdentifier(value1, value2))
                && !comparer.comparer(white, new StraightFlushIdentifier())) ? true
                        : straightFlushComparer.blackHandWinnerForStraightFlushCase(black, white);
    }
}
