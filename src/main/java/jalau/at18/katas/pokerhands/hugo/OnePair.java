package jalau.at18.katas.pokerhands.hugo;

public class OnePair {

    private static final int NUMBER_OF_PAIRS = 1;
    private PokerHandAnalizer pairAnalizer;

    public OnePair() {
        this.pairAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        PairsNumber numberOfPairs = new PairsNumber(NUMBER_OF_PAIRS);
        return pairAnalizer.analize(hand, numberOfPairs);
    }
}
