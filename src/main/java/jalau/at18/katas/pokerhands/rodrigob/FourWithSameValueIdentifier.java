package jalau.at18.katas.pokerhands.rodrigob;

public class FourWithSameValueIdentifier {

    private static final int CARDS_WITH_SAME_VALUE = 4;
    private PokerHandAnalizer analizer;

    public FourWithSameValueIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        CardsWithSameValue cardsWithSameValue = new CardsWithSameValue(CARDS_WITH_SAME_VALUE);
        return analizer.analize(hand, cardsWithSameValue);
    }
}
