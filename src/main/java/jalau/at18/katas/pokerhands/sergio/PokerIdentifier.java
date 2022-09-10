package jalau.at18.katas.pokerhands.sergio;

public class PokerIdentifier {
    private PokerHandAnalizer analizer;
    private final int fiveTimesRepeated = 5;

    public PokerIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        SameValuePattern pokerPattern = new SameValuePattern(fiveTimesRepeated);
        return analizer.analize(hand, pokerPattern);
    }
}
