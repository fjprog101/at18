package jalau.at18.katas.pokerhands.mauricio;

public class PairIdentifier implements IndetifyHand {
    private PokerHandAnalizer analizer;
    private CardValue value1;
    private CardValue value2;

    public PairIdentifier(CardValue value1, CardValue value2) {
        this.analizer = new PokerHandAnalizer();
        this.value1 = value1;
        this.value2 = value2;
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        Pair pair = new Pair(value1, value2);
        return analizer.analize(hand, pair) && !analizer.analize(hand, allSameSuit);
    }
}
