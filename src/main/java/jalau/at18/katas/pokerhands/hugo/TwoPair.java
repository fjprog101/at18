package jalau.at18.katas.pokerhands.hugo;

public class TwoPair {

    private static final int NUMBER_OF_PAIRS = 2;
    private PokerHandAnalizer analizer;

    public TwoPair() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        PairsNumber numberOfPairs = new PairsNumber(NUMBER_OF_PAIRS);
        return analizer.analize(hand, numberOfPairs);
    }
}
