package jalau.at18.katas.pokerhands.rodrigob;

public class ThreeWithSameValueIdentifier extends HandType {

    private static final int CARDS_WITH_SAME_VALUE = 3;
    private PokerHandAnalizer analizer;
    private int numericValue;

    public ThreeWithSameValueIdentifier() {
        this.analizer = new PokerHandAnalizer();
        this.numericValue = 0;
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithSameValue cardsWithSameValue = new CardsWithSameValue(CARDS_WITH_SAME_VALUE);
        return analizer.analize(hand, cardsWithSameValue);
    }

    public int getRankedValue(PokerHand hand) {
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
