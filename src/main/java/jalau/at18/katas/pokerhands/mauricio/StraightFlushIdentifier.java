package jalau.at18.katas.pokerhands.mauricio;

public class StraightFlushIdentifier implements IndetifyHand {

    private PokerHandAnalizer analizer;

    public StraightFlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, allSameSuit) && analizer.analize(hand, consecutiveValues);
    }
}
