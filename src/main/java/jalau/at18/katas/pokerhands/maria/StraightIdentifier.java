package jalau.at18.katas.pokerhands.maria;

public class StraightIdentifier implements PokerHandIdentifier {
    private PokerHandAnalizer analizer;

    public StraightIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, consecutiveValues);
    }

    @Override
    public PokerHandRank getRank(PokerHand hand) {
        return null;
    }
}
