package jalau.at18.katas.pokerhands.rodrigov;

public class PairIndentifier {
    private PokerHandAnalizer analizer;

    public PairIndentifier() {
        analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        Pair pair = new Pair();
        return analizer.analize(hand, pair);
    }
}
