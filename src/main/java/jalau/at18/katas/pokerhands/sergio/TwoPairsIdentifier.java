package jalau.at18.katas.pokerhands.sergio;

public class TwoPairsIdentifier extends CardsPattern {
    private PokerHandAnalizer analizer;

    public TwoPairsIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    boolean match(PokerHand hand) {
        SameValuePattern twoPairPattern = new SameValuePattern(2);
        return analizer.analize(hand, twoPairPattern);
    }

}
