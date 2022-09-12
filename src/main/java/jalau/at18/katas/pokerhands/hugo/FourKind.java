package jalau.at18.katas.pokerhands.hugo;

public class FourKind extends HandIdentifier {

    private static final int FOUR_OF_A_KIND_CARDS = 4;
    private PokerHandAnalizer kindAnalizer;
    private int numericValue;

    public FourKind() {
        kindAnalizer = new PokerHandAnalizer();
        this.numericValue = 0;
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithSameValue handWithFourOfAKind = new CardsWithSameValue(FOUR_OF_A_KIND_CARDS);
        return kindAnalizer.analize(hand, handWithFourOfAKind);
    }

    public int getRankedValue(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        maximumValue(hand, count);
        return numericValue;
    }

    public void maximumValue(PokerHand hand, CardValuesCount count) {
        for (Card card : hand.getCards()) {
            if (count.get(card.getValue()) == FOUR_OF_A_KIND_CARDS) {
                numericValue = card.getValue().getNumericValue();
            }
        }
    }
}
