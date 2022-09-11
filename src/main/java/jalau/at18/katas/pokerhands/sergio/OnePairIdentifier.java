package jalau.at18.katas.pokerhands.sergio;

public class OnePairIdentifier extends CardsPattern {
    private PokerHandAnalizer analizer;

    public OnePairIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    boolean match(PokerHand hand) {
        SameValuePattern onePairPattern = new SameValuePattern(1);
        return analizer.analize(hand, onePairPattern);
    }

}
