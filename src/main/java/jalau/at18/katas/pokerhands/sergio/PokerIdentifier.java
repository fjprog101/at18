package jalau.at18.katas.pokerhands.sergio;

public class PokerIdentifier extends CardsPattern {
    private PokerHandAnalizer analizer;
    private final int fiveTimesRepeated = 5;

    public PokerIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    boolean match(PokerHand hand) {
        SameValuePattern pokerPattern = new SameValuePattern(fiveTimesRepeated);
        return analizer.analize(hand, pokerPattern);
    }
}
