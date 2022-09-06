package jalau.at18.katas.pokerhands.libertad;

public class TwoPairIdentifier {
    private PokerHandAnalizer pokerHandAnalizer;

    public TwoPairIdentifier() {
        pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        TwoPair twoPair = new TwoPair();
        return pokerHandAnalizer.analize( hand, twoPair);
    }
    
}
