package jalau.at18.katas.pokerhands.rodrigob;

public class OnePairIdentifier extends HandType {

    private static final int NUMBER_PAIR = 1;
    private PokerHandAnalizer analizer;

    public OnePairIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        NumberOfPairs numberOfPairs = new NumberOfPairs(NUMBER_PAIR);
        return analizer.analize(hand, numberOfPairs);
    }
}
