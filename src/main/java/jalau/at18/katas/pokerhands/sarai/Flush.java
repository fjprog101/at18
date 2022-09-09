package jalau.at18.katas.pokerhands.sarai;

public class Flush extends Cardhigth {

    private PokerHandAnalizer analizer;

    public Flush() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        return analizer.analize(hand, allSameSuit);
    }

    @Override
    Higth getidentifyOperation() {
        return Higth.FLUSH;
    }
}
