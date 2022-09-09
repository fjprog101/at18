package jalau.at18.katas.pokerhands.rodrigov;

public class FlushIdenfier {
    private PokerHandAnalizer analizer;
    public FlushIdenfier() {
        analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        return analizer.analize(hand, allSameSuit);
    }
}
