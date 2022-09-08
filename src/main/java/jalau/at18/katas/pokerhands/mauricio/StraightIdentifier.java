package jalau.at18.katas.pokerhands.mauricio;

public class StraightIdentifier implements IndetifyHand {
    private PokerHandAnalizer analizer;

    public StraightIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, consecutiveValues) && !analizer.analize(hand, allSameSuit);
    }
}
