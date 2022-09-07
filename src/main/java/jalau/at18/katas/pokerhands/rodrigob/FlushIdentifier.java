package jalau.at18.katas.pokerhands.rodrigob;

public class FlushIdentifier {

    private PokerHandAnalizer analizer;

    public FlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        return analizer.analize(hand, allSameSuit);
    }
}
