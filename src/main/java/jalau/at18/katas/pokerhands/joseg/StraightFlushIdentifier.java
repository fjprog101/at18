package jalau.at18.katas.pokerhands.joseg;

public class StraightFlushIdentifier {

    public boolean identify(PokerHand hand) {
        return hand.hasAllCardsSameSuit() && hand.hasConsecutiveValues();
    }

}
