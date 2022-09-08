package jalau.at18.katas.pokerhands.maria;

public class ThreeKindIdentifier implements PokerHandIdentifier {
    public static final int CARDS_SAME_VALUE = 3;
    private PokerHandAnalizer analizer;

    public ThreeKindIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithSameValue cardsWithSameValue = new CardsWithSameValue(CARDS_SAME_VALUE);
        return analizer.analize(hand, cardsWithSameValue);
    }

    @Override
    public PokerHandRank getRank(PokerHand hand) {
        return null;
    }
}
