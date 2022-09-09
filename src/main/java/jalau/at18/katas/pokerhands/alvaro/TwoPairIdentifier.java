package jalau.at18.katas.pokerhands.alvaro;

public class TwoPairIdentifier {
    private PokerHandAnalizer analizer;
    public TwoPairIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }
    public boolean identify(PokerHand twoPairHand) {
        TwoPair twoPair = new TwoPair();
        return analizer.analize(twoPairHand, twoPair);
    }

}
