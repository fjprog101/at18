package jalau.at18.katas.pokerhands.sergio;

public class ThreeOfKindIdentifier {
    private PokerHandAnalizer analizer;
    private final int threeTimesRepeated = 3;

    public ThreeOfKindIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        SameValuePattern twoConsecutiveValues = new SameValuePattern(threeTimesRepeated);
        return analizer.analize(hand, twoConsecutiveValues);
    }
}
