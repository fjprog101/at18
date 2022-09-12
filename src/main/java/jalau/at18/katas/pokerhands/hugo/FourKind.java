package jalau.at18.katas.pokerhands.hugo;

public class FourKind extends HandIdentifier {

    private static final int FOUR_OF_A_KIND_CARDS = 4;
    private PokerHandAnalizer kindAnalizer;

    public FourKind() {
        kindAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        CardsWithSameValue handWithFourOfAKind = new CardsWithSameValue(FOUR_OF_A_KIND_CARDS);
        return kindAnalizer.analize(hand, handWithFourOfAKind);
    }
}
