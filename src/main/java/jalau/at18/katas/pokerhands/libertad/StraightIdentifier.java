package jalau.at18.katas.pokerhands.libertad;

public class StraightIdentifier implements Identifier {
    private PokerHandAnalizer analizer;

    public StraightIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }
    @Override
    public boolean identify(PokerHand hand) {
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, consecutiveValues);
    }
}
