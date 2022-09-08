package jalau.at18.katas.pokerhands.rodrigob;

public class FullHouseIdentifier extends HandType {

    private static final int CARDS_WITH_SAME_VALUE = 3;
    private PokerHandAnalizer analizer;

    public FullHouseIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithSameValue threeOfAKind = new CardsWithSameValue(CARDS_WITH_SAME_VALUE);
        NumberOfPairs onePair = new NumberOfPairs(1);
        return analizer.analize(hand, threeOfAKind) && analizer.analize(hand, onePair);
    }
}
