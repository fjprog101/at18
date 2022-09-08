package jalau.at18.katas.pokerhands.mauricio;

public class StraightComparer {
    private FlushComparer flushComparer = new FlushComparer();

    public Boolean straightCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (new StraightIdentifier().identify(black)
                && !new FlushIdentifier().identify(white)) ? true
                        : flushComparer.flushCase(black, white, value1, value2);
    }
}
