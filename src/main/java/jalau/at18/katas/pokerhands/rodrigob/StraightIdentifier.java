package jalau.at18.katas.pokerhands.rodrigob;

public class StraightIdentifier {

    private PokerHandAnalizer analizer;

    public StraightIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, consecutiveValues);
    }
}
