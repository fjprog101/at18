package jalau.at18.katas.pokerhands.daniela;

public class OnePairIdentifier {
    private PokerHandAnalizer analizer;
    private CardValue value1;
    private CardValue value2;

    public OnePairIdentifier(CardValue value1, CardValue value2) {
        this.analizer = new PokerHandAnalizer();
        this.value1 = value1;
        this.value2 = value2;
    }

    public boolean identify(PokerHand hand) {
        // Analice this class
        OnePair onepair = new OnePair(value1, value2);
        return analizer.analize(hand, onepair);
    }
}
