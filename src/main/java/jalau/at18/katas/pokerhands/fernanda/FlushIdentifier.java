package jalau.at18.katas.pokerhands.fernanda;

public class FlushIdentifier {
    private PokerHandAnalizer pokerHandAnalizer;

    public FlushIdentifier() {
        pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit flush = new AllSameSuit();
        return pokerHandAnalizer.analize(hand, flush);
    }
}
