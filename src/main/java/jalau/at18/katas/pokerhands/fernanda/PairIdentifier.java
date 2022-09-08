package jalau.at18.katas.pokerhands.fernanda;

public class PairIdentifier extends Identifier {
    private PokerHandAnalizer pokerHandAnalizer;

    public PairIdentifier() {
        pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        Pair pair = new Pair();
        return pokerHandAnalizer.analize(hand, pair);
    }
    public RankHand getTypeofHand() {
        return RankHand.PAIR;
    }
}
