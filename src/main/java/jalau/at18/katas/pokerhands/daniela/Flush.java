package jalau.at18.katas.pokerhands.daniela;

public class Flush {
    private PokerHandAnalizer analizer;

    public Flush() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        return analizer.analize(hand, allSameSuit);
    }
}
