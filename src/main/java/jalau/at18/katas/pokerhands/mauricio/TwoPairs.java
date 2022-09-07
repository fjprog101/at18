package jalau.at18.katas.pokerhands.mauricio;


public class TwoPairs extends CardsPattern{
    private final int one = 1;
    private final int two = 2;
    private CardValue value1;
    private CardValue value2;

    public TwoPairs(CardValue value1, CardValue value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public boolean match(PokerHand handWith2PairsPerHand){
        boolean matchTwoPairs = twoPairs(handWith2PairsPerHand);
        return matchTwoPairs;
    }

    public boolean twoPairs(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount count = cardValuesCounter.getCount();
        boolean valueCount1 = (count.get(value1) == two) ? true : false;
        boolean valueCount2 = (count.get(value2) == two) ? true : false;
        return (valueCount1 == valueCount2) && (count.get(value1) != one) && (count.get(value2) != one) ;
    }
}
