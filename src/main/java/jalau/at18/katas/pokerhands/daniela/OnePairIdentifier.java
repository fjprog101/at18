package jalau.at18.katas.pokerhands.daniela;

public class OnePairIdentifier {
    private PokerHandAnalizer analizer;
    private CardValue value1;
    private CardValue value2;

    public OnePairIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        OnePair onepair = new OnePair(value1, value2);
        return analizer.analize(hand, onepair);
    }
}
