package jalau.at18.katas.pokerhands.rodrigov;

public class StraightIdentifier extends Identifier{
    private PokerHandAnalizer analizer;
    public StraightIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    boolean identify(PokerHand hand) {
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, consecutiveValues);
    }

    @Override
    Rank identifyRank() {
        // TODO Auto-generated method stub
        return null;
    }
}
