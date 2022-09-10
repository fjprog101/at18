package jalau.at18.katas.pokerhands.sergio;

public class StraightIdentifier {

    private PokerHandAnalizer analizer;

    public StraightIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return !analizer.analize(hand, allSameSuit) && analizer.analize(hand, consecutiveValues);
    }
}
