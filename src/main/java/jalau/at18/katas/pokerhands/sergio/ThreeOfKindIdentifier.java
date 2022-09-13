package jalau.at18.katas.pokerhands.sergio;

public class ThreeOfKindIdentifier extends CardsPattern {
    private PokerHandAnalizer analizer;
    private final int threeTimesRepeated = 3;

    public ThreeOfKindIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    boolean match(PokerHand hand) {
        SameValuePattern threeOfKindPattern = new SameValuePattern(threeTimesRepeated);
        return analizer.analize(hand, threeOfKindPattern);
    }
}
