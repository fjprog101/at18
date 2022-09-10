package jalau.at18.katas.pokerhands.alvaro;

public class FlushIdentifier {
    private PokerHandAnalizer analizer;

    public FlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand flushHand) {
        AllSameSuit flush = new AllSameSuit();
        ConsecutiveValues consecutiveValues =  new ConsecutiveValues();
        return analizer.analize(flushHand, flush) && !analizer.analize(flushHand, consecutiveValues);
    }
}
