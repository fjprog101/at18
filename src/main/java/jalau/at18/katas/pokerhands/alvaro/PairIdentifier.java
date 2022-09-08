package jalau.at18.katas.pokerhands.alvaro;

public class PairIdentifier {
    private PokerHandAnalizer analizer;
    public PairIdentifier() {
        this.analizer =  new PokerHandAnalizer();
    }

    public boolean identify(PokerHand pairHand) {
        Pair pair = new Pair();
        return analizer.analize(pairHand, pair);
    }

}
