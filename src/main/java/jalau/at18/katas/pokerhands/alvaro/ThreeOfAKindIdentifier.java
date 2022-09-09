package jalau.at18.katas.pokerhands.alvaro;

public class ThreeOfAKindIdentifier {
    private PokerHandAnalizer analizer;
    private static final int COUNT = 3;
    public ThreeOfAKindIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand threeOfAKindHand) {
        FourOfAKind threeOfAKind = new FourOfAKind(COUNT);
        return analizer.analize(threeOfAKindHand, threeOfAKind);
    }

}
