package jalau.at18.katas.pokerhands.mauricio;

public class TwoPairs extends CardValuesCounter {
    private final int one = 1;
    private final int two = 2;
    private CardValue value1;
    private CardValue value2;
    private CardValue value3;

    public TwoPairs(PokerHand handWith2PairsPerHand, CardValue value1, CardValue value2, CardValue value3) {
        super(handWith2PairsPerHand);
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    private CardValuesCount count = super.getCount();

    public boolean twoPairs() {
        boolean valueCount1 = (count.get(value1) == two) ? true : false;
        boolean valueCount2 = (count.get(value2) == two) ? true : false;
        boolean valueCount3 = (count.get(value3) == one) ? true : false;
        return valueCount1 == valueCount2 == valueCount3;
    }
}
