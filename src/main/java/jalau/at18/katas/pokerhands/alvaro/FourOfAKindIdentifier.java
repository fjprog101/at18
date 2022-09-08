package jalau.at18.katas.pokerhands.alvaro;

public class FourOfAKindIdentifier {
    private PokerHandAnalizer analizer;
    private static final int COUNT = 4;
    public FourOfAKindIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand fourOfAKindHand) {
        FourOfAKind fourOfAKind = new FourOfAKind(COUNT);
        return analizer.analize(fourOfAKindHand, fourOfAKind);
    }

}
