package jalau.at18.katas.pokerhands.joser;

public class ThreeKind {
    private PokerHandAnalizer pokerHandAnalizer;

    public ThreeKind() {
        this.pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        ThreeKindPattern three = new ThreeKindPattern();
        return pokerHandAnalizer.analize(hand, three);
    }
}
