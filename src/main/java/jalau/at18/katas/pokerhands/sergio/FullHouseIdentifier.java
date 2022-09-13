package jalau.at18.katas.pokerhands.sergio;

public class FullHouseIdentifier extends CardsPattern {
    private PokerHandAnalizer analizer;
    private final int fourTimesRepeated = 4;

    public FullHouseIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    boolean match(PokerHand hand) {
        SameValuePattern fullHousePattern = new SameValuePattern(fourTimesRepeated);
        return analizer.analize(hand, fullHousePattern);
    }
}
