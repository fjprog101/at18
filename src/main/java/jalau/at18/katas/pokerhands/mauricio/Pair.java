package jalau.at18.katas.pokerhands.mauricio;

public class Pair extends CardsPattern {
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private CardValue value1;
    private CardValue value2;

    public Pair(CardValue value1, CardValue value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public boolean match(PokerHand handWith2PairsPerHand) {
        boolean matchTwoPairs = twoPairs(handWith2PairsPerHand);
        return matchTwoPairs;
    }

    public boolean twoPairs(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount count = cardValuesCounter.getCount();
        boolean valueCount1 = (count.get(value1) == two && count.get(value1) != three && count.get(value1) != four) ? true : false;
        boolean valueCount2 = (count.get(value2) == one && count.get(value2) != three && count.get(value2) != four) ? true : false;
        return (valueCount1 == valueCount2) && (count.get(value1) != one) && (count.get(value2) != two);
    }
}
