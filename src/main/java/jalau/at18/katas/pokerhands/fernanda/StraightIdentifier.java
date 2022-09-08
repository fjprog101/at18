package jalau.at18.katas.pokerhands.fernanda;

public class StraightIdentifier extends Identifier {
    private PokerHandAnalizer pokerHandAnalizer;

    public StraightIdentifier() {
        pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        ConsecutiveValues straight = new ConsecutiveValues();
        return pokerHandAnalizer.analize(hand, straight);
    }
}
