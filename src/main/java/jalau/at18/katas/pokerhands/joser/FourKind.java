package jalau.at18.katas.pokerhands.joser;

public class FourKind {
    private PokerHandAnalizer pokerHandAnalizer;

    public FourKind() {
        this.pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        FourKindPattern four = new FourKindPattern();
        return pokerHandAnalizer.analize(hand, four);
    }
}
