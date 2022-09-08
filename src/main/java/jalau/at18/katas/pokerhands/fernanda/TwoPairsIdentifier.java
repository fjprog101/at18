package jalau.at18.katas.pokerhands.fernanda;


public class TwoPairsIdentifier extends Identifier {
    private PokerHandAnalizer pokerHandAnalizer;

    public TwoPairsIdentifier() {
        pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        TwoPairs twoPairs = new TwoPairs();
        return pokerHandAnalizer.analize(hand, twoPairs);
    }
}