package jalau.at18.katas.pokerhands.mauricio;

public class StraightFlushComparer {
    public Boolean straightFlushCase(PokerHand black, PokerHand white) {
        return (new StraightFlushIdentifier().identify(black) && !new StraightFlushIdentifier().identify(white)) ? true
                : false;
    }
}
