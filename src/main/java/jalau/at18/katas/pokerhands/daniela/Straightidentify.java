package jalau.at18.katas.pokerhands.daniela;

public class Straightidentify {
    private PokerHandAnalizer analizer;

    public Straightidentify() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, consecutiveValues);
    }
}
