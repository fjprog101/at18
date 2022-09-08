package jalau.at18.katas.pokerhands.daniela;

public class StraightFlushIdentifier extends CompareGame {

    private PokerHandAnalizer analizer;

    public StraightFlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, allSameSuit) && analizer.analize(hand, consecutiveValues);
    }
}
