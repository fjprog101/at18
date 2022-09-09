package jalau.at18.katas.pokerhands.alvaro;

public class HighCardIdentifier {
    private PokerHandAnalizer analizer;
    public HighCardIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }
    public boolean identify(PokerHand highCardHand) {
        Pair pair = new Pair();
        return !analizer.analize(highCardHand, pair);
    }

}
