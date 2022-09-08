package jalau.at18.katas.pokerhands.libertad;

public class PairIdentifier implements Identifier {
    private PokerHandAnalizer pokerHandAnalizer;

    public PairIdentifier() {
        pokerHandAnalizer = new PokerHandAnalizer();
    }
    @Override
    public boolean identify(PokerHand hand) {
        Pair pair = new Pair();
        return pokerHandAnalizer.analize(hand, pair);
    }
}
