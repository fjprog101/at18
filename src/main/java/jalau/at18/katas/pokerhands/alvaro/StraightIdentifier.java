package jalau.at18.katas.pokerhands.alvaro;

public class StraightIdentifier extends Identifiers {
    private PokerHandAnalizer analizer;
    public StraightIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }
    @Override
    public boolean identify(PokerHand straightHand) {
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        AllSameSuit sameSuit = new AllSameSuit();
        return analizer.analize(straightHand, consecutiveValues) && !analizer.analize(straightHand, sameSuit);
    }
}
