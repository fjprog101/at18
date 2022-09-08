package jalau.at18.katas.pokerhands.daniela;

public class Flush extends CompareGame {
    private PokerHandAnalizer analizer;

    public Flush() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        return analizer.analize(hand, allSameSuit);
    }
}
