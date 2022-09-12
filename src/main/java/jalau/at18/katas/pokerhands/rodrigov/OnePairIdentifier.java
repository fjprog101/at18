package jalau.at18.katas.pokerhands.rodrigov;

public class OnePairIdentifier extends Identifier {
    private PokerHandAnalizer analizer;

    public OnePairIdentifier() {
        analizer = new PokerHandAnalizer();
    }

    @Override
    boolean identify(PokerHand hand) {
        OnePair onePair = new OnePair();
        return analizer.analize(hand, onePair);
    }

    @Override
    Rank identifyRank() {
        return Rank.PAIR;
    }
}
