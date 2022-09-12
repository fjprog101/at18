package jalau.at18.katas.pokerhands.carlos;

public class FlushIdentifier extends CardsPattern {
    private PokerHandAnalizer analizer;

    public FlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    boolean match(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, allSameSuit) && !analizer.analize(hand, consecutiveValues);
    }
}
