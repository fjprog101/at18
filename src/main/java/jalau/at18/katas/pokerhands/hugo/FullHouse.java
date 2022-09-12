package jalau.at18.katas.pokerhands.hugo;

public class FullHouse {

    private PokerHandAnalizer analizer;
    private static final int THREE_KIND = 3;
    private static final int PAIRS = 1;

    public FullHouse() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        CardsWithSameValue threeOfAKind = new CardsWithSameValue(THREE_KIND);
        PairsNumber aPair = new PairsNumber(PAIRS);
        return analizer.analize(hand, threeOfAKind) && analizer.analize(hand, aPair);
    }
}
