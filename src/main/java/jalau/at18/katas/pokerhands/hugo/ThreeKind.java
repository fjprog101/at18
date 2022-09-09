package jalau.at18.katas.pokerhands.hugo;

public class ThreeKind {

    private static final int THREE_OF_A_KIND_CARDS = 3;
    private PokerHandAnalizer kindAnalizer;

    public ThreeKind() {
        kindAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        CardsWithSameValue handWiththreeOfAKind = new CardsWithSameValue(THREE_OF_A_KIND_CARDS);
        return kindAnalizer.analize(hand, handWiththreeOfAKind);
    }
}
