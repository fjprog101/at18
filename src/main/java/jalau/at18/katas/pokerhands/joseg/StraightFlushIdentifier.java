package jalau.at18.katas.pokerhands.joseg;

public class StraightFlushIdentifier {

    private PokerHandAnalizer analizer;

    public StraightFlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        return analizer.hasAllCardsSameSuit(hand) && analizer.hasConsecutiveValues(hand);
    }

}
