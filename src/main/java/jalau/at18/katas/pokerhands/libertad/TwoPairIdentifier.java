package jalau.at18.katas.pokerhands.libertad;

public class TwoPairIdentifier implements Identifier {
    private PokerHandAnalizer pokerHandAnalizer;

    public TwoPairIdentifier() {
        pokerHandAnalizer = new PokerHandAnalizer();
    }
    @Override
    public boolean identify(PokerHand hand) {
        TwoPair twoPair = new TwoPair();
        return pokerHandAnalizer.analize(hand, twoPair);
    }
}
