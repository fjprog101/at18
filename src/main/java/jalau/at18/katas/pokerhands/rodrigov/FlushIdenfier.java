package jalau.at18.katas.pokerhands.rodrigov;

public class FlushIdenfier extends Identifier{
    private PokerHandAnalizer analizer;
    public FlushIdenfier() {
        analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        return analizer.analize(hand, allSameSuit);
    }

    @Override
    Rank identifyRank() {
        return Rank.FLUSH;
    }
}
