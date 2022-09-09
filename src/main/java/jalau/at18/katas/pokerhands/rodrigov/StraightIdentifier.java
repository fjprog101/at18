package jalau.at18.katas.pokerhands.rodrigov;

public class StraightIdentifier {
    private PokerHandAnalizer analizer;
    public StraightIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean indentify(PokerHand hand) {
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, consecutiveValues);
    }
}
