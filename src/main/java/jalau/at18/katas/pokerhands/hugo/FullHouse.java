package jalau.at18.katas.pokerhands.hugo;

public class FullHouse extends HandIdentifier {

    private PokerHandAnalizer analizer;
    private static final int THREE_KIND = 3;
    private static final int PAIRS = 1;
    private int numericValue;

    public FullHouse() {
        this.analizer = new PokerHandAnalizer();
        this.numericValue = 0;
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithSameValue threeOfAKind = new CardsWithSameValue(THREE_KIND);
        PairsNumber aPair = new PairsNumber(PAIRS);
        return analizer.analize(hand, threeOfAKind) && analizer.analize(hand, aPair);
    }

    public int getRankedValue(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        maximumValue(hand, count);
        return numericValue;
    }

    public void maximumValue(PokerHand hand, CardValuesCount count) {
        for (Card card : hand.getCards()) {
            if (count.get(card.getValue()) == THREE_KIND) {
                numericValue = card.getValue().getNumericValue();
            }
        }
    }
}
