package jalau.at18.katas.pokerhands.rodrigob;

public class FlushIdentifier extends HandType {

    private PokerHandAnalizer analizer;

    public FlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        return analizer.analize(hand, allSameSuit);
    }
}
