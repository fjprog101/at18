package jalau.at18.katas.pokerhands.libertad;

public class ThreeOfAKindIdentifier implements Identifier {
    private PokerHandAnalizer analizer;
    ThreeOfAKindIdentifier() {
        analizer = new PokerHandAnalizer();
    }
    @Override
    public boolean identify(PokerHand hand) {
        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        return analizer.analize(hand, threeOfAKind);
    }
}
