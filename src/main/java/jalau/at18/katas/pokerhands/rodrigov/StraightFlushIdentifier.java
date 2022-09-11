package jalau.at18.katas.pokerhands.rodrigov;

public class StraightFlushIdentifier extends Identifier{

    private PokerHandAnalizer analizer;

    public StraightFlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, allSameSuit) && analizer.analize(hand, consecutiveValues);
    }

    @Override
    Rank identifyRank() {
        // TODO Auto-generated method stub
        return null;
    }
}
