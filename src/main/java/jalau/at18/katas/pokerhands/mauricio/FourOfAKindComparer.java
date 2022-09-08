package jalau.at18.katas.pokerhands.mauricio;

public class FourOfAKindComparer {
    private StraightFlushComparer straightFlushComparer = new StraightFlushComparer();


    public Boolean fourOfAKindCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (new FourOfAKindIdentifier(value1, value2).identify(black)
                && !new StraightFlushIdentifier().identify(white)) ? true
                        : straightFlushComparer.straightFlushCase(black, white);
    }
}
