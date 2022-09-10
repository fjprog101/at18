package jalau.at18.katas.pokerhands.sergio;

public class FullHouseIdentifier {
    private PokerHandAnalizer analizer;
    private final int fourTimesRepeated = 4;

    public FullHouseIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        SameValuePattern fullHousePattern = new SameValuePattern(fourTimesRepeated);
        return analizer.analize(hand, fullHousePattern);
    }
}
