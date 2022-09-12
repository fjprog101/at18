package jalau.at18.katas.pokerhands.hugo;

public class TwoPair extends HandIdentifier {

    private static final int NUMBER_OF_PAIRS = 2;
    private static final int CARDS_WITH_SAME_VALUE = 2;
    private PokerHandAnalizer pairAnalizer;
    private int numericValue;

    public TwoPair() {
        this.pairAnalizer = new PokerHandAnalizer();
        this.numericValue = 0;
    }

    @Override
    public boolean identify(PokerHand hand) {
        PairsNumber numberOfPairs = new PairsNumber(NUMBER_OF_PAIRS);
        return pairAnalizer.analize(hand, numberOfPairs);
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
