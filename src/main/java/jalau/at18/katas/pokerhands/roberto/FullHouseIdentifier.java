package jalau.at18.katas.pokerhands.roberto;

public class FullHouseIdentifier {
    public static final int THREE = 3;
    public static final int TWO = 2;

    public boolean identify(PokerHand fullHouseHand) {
        CardValuesCounter counter = new CardValuesCounter(fullHouseHand);
        CardValuesCount count = counter.getCount();
        return count.exists(THREE) && count.exists(TWO);
    }
}
