package jalau.at18.katas.pokerhands.fernanda;

public class ThreeOfAKindIdentifier extends Identifier {
    private PokerHandAnalizer pokerHandAnalizer;

    public ThreeOfAKindIdentifier() {
        pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        ThreeOFAKind threeofaKind = new ThreeOFAKind();
        ThreeValuesinHand threevalues = new ThreeValuesinHand();
        return pokerHandAnalizer.analize(hand, threeofaKind) && pokerHandAnalizer.analize(hand, threevalues);
    }
}
