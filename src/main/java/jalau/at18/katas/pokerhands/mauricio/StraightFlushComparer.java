package jalau.at18.katas.pokerhands.mauricio;

public class StraightFlushComparer {
    private PokerHandComparer comparer = new PokerHandComparer();

    public Boolean straightFlushCase(PokerHand black, PokerHand white) {
        return (comparer.comparer(black, new StraightFlushIdentifier())
                && !comparer.comparer(white, new StraightFlushIdentifier())) ? true
                        : false;
    }
}
