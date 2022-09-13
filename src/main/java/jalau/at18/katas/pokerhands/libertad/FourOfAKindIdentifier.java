package jalau.at18.katas.pokerhands.libertad;

public class FourOfAKindIdentifier implements Identifier {
    private PokerHandAnalizer analizer;
    FourOfAKindIdentifier() {
        analizer = new PokerHandAnalizer();
    }
    @Override
    public boolean identify(PokerHand hand) {
        FourOfAKind fourOfAKind = new FourOfAKind();
        return analizer.analize(hand, fourOfAKind);
    }
}
