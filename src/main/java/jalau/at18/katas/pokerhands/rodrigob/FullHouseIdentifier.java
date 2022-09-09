package jalau.at18.katas.pokerhands.rodrigob;

public class FullHouseIdentifier extends HandType {

    private static final int CARDS_WITH_SAME_VALUE = 3;
    private PokerHandAnalizer analizer;
    private int numericValue;

    public FullHouseIdentifier() {
        this.analizer = new PokerHandAnalizer();
        this.numericValue = 0;
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithSameValue threeOfAKind = new CardsWithSameValue(CARDS_WITH_SAME_VALUE);
        NumberOfPairs onePair = new NumberOfPairs(1);
        return analizer.analize(hand, threeOfAKind) && analizer.analize(hand, onePair);
    }

    @Override
    public int getCardRankedValue(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        maximumValue(hand, count);
        return numericValue;
    }

    public void maximumValue(PokerHand hand, CardValuesCount count) {
        for (Card card : hand.getCards()) {
            if (count.get(card.getValue()) == CARDS_WITH_SAME_VALUE) {
                numericValue = card.getValue().getNumericValue();
            }
        }
    }
}
