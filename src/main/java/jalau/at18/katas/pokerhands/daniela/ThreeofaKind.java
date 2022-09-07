package jalau.at18.katas.pokerhands.daniela;

public class ThreeofaKind extends CardsPattern {
    private final int threecards = 3;
    private final int othercard = 1;
    private CardValue value1;
    private CardValue value2;

    public ThreeofaKind(CardValue value1, CardValue value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public boolean match(PokerHand handWith3SimilarCards) {
        onePairs(handWith3SimilarCards);
        return onePairs(handWith3SimilarCards);
    }

    public boolean onePairs(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount count = cardValuesCounter.getCount();
        boolean valueCount1 = (count.get(value1) == threecards) ? true : false;
        boolean valueCount2 = (count.get(value2) == othercard) ? true : false;

        return (valueCount1 == valueCount2);
    }
}
