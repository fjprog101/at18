package jalau.at18.katas.pokerhands.sergio;

public class OnePairIdentifier {
    private PokerHandAnalizer analizer;

    public OnePairIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        SameValuePattern onePairPattern = new SameValuePattern(1);
        return analizer.analize(hand, onePairPattern);
    }

}
