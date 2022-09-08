package jalau.at18.katas.pokerhands.joser;

public class TwoPairs {
    private PokerHandAnalizer pokerHandAnalizer;

    public TwoPairs() {
        this.pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        TwoPairPattern twoPair = new TwoPairPattern();
        return pokerHandAnalizer.analize(hand, twoPair);
    }
}
