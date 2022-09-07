package jalau.at18.katas.pokerhands.fernanda;

public class FourOfAKindIdentifier extends Identifier {
    private PokerHandAnalizer pokerHandAnalizer;

    public FourOfAKindIdentifier() {
        pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        FourOfAKind fourofaKind = new FourOfAKind();
        return pokerHandAnalizer.analize(hand, fourofaKind);
    }
}
