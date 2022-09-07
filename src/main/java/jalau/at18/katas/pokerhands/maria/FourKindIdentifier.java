package jalau.at18.katas.pokerhands.maria;

public class FourKindIdentifier {
    public static final int CARDS_SAME_VALUE = 4;
    private PokerHandAnalizer analizer;

    public FourKindIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        CardsWithSameValue cardsWithSameValueThree = new CardsWithSameValue(CARDS_SAME_VALUE);
        return analizer.analize(hand, cardsWithSameValueThree);
    }
}
