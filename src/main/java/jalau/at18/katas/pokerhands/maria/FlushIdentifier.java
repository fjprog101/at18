package jalau.at18.katas.pokerhands.maria;

public class FlushIdentifier implements PokerHandIdentifier {
    private PokerHandAnalizer analizer;

    public FlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        return analizer.analize(hand, allSameSuit);
    }

    @Override
    public PokerHandRank getRank(PokerHand hand) {
        return null;
    }
}
