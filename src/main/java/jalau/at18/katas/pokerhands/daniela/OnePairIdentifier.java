package jalau.at18.katas.pokerhands.daniela;

public class OnePairIdentifier extends CompareGame {
    private PokerHandAnalizer analizer;

    public OnePairIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        OnePair onepair = new OnePair();
        return analizer.analize(hand, onepair);
    }

    @Override
    Rank getidentifyPokerhand() {
        return Rank.PAIR;
    }
}
