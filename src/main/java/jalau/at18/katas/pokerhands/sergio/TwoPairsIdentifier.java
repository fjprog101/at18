package jalau.at18.katas.pokerhands.sergio;

public class TwoPairsIdentifier {
    private PokerHandAnalizer analizer;

    public TwoPairsIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        NConsecutiveValues twoConsecutiveValues = new NConsecutiveValues(2);
        return analizer.analize(hand, twoConsecutiveValues);
    }

}
