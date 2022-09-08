package jalau.at18.katas.pokerhands.rodrigob;

public class ThreeWithSameValueIdentifier extends HandType {

    private static final int CARDS_WITH_SAME_VALUE = 3;
    private PokerHandAnalizer analizer;

    public ThreeWithSameValueIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithSameValue cardsWithSameValue = new CardsWithSameValue(CARDS_WITH_SAME_VALUE);
        return analizer.analize(hand, cardsWithSameValue);
    }
}
