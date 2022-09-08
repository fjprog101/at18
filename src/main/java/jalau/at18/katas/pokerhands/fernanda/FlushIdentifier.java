package jalau.at18.katas.pokerhands.fernanda;

public class FlushIdentifier extends Identifier {
    private PokerHandAnalizer pokerHandAnalizer;

    public FlushIdentifier() {
        pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit flush = new AllSameSuit();
        return pokerHandAnalizer.analize(hand, flush);
    }

    @Override
    RankHand getTypeofHand() {
        return RankHand.FLUSH;
    }
}
