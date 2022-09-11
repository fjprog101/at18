package jalau.at18.katas.pokerhands.alvaro;

public class FlushIdentifier extends Identifiers {
    private PokerHandAnalizer analizer;

    public FlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }
    @Override
    public boolean identify(PokerHand flushHand) {
        AllSameSuit flush = new AllSameSuit();
        ConsecutiveValues consecutiveValues =  new ConsecutiveValues();
        return analizer.analize(flushHand, flush) && !analizer.analize(flushHand, consecutiveValues);
    }
}
