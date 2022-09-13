package jalau.at18.katas.pokerhands.alvaro;
public class TwoPairIdentifier extends Identifiers {
    private PokerHandAnalizer analizer;
    public TwoPairIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }
    @Override
    public boolean identify(PokerHand twoPairHand) {
        TwoPair twoPair = new TwoPair();
        return analizer.analize(twoPairHand, twoPair);
    }
}
