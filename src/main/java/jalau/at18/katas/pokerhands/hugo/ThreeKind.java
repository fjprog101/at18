package jalau.at18.katas.pokerhands.hugo;

public class ThreeKind extends HandIdentifier {

    private static final int THREE_OF_A_KIND_CARDS = 3;
    private PokerHandAnalizer kindAnalizer;
    private int numericValue;

    public ThreeKind() {
        kindAnalizer = new PokerHandAnalizer();
        this.numericValue = 0;
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithSameValue handWithThreeOfAKind = new CardsWithSameValue(THREE_OF_A_KIND_CARDS);
        return kindAnalizer.analize(hand, handWithThreeOfAKind);
    }

    public int getRankedValue(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        maximumValue(hand, count);
        return numericValue;
    }

    public void maximumValue(PokerHand hand, CardValuesCount count) {
        for (Card card : hand.getCards()) {
            if (count.get(card.getValue()) == THREE_OF_A_KIND_CARDS) {
                numericValue = card.getValue().getNumericValue();
            }
        }
    }
}
