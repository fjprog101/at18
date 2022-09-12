package jalau.at18.katas.pokerhands.hugo;

public class Flush extends HandIdentifier {

    private PokerHandAnalizer analizer;

    public Flush() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit flushHand = new AllSameSuit();
        return analizer.analize(hand, flushHand);
    }
}
