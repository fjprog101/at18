package jalau.at18.katas.pokerhands.hugo;

public class TwoPair extends HandIdentifier {

    private static final int NUMBER_OF_PAIRS = 2;
    private PokerHandAnalizer pairAnalizer;

    public TwoPair() {
        this.pairAnalizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        PairsNumber numberOfPairs = new PairsNumber(NUMBER_OF_PAIRS);
        return pairAnalizer.analize(hand, numberOfPairs);
    }
}
