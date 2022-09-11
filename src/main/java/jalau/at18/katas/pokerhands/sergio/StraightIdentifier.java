package jalau.at18.katas.pokerhands.sergio;

public class StraightIdentifier extends CardsPattern {

    private PokerHandAnalizer analizer;

    public StraightIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    boolean match(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return !analizer.analize(hand, allSameSuit) && analizer.analize(hand, consecutiveValues);
    }
}
