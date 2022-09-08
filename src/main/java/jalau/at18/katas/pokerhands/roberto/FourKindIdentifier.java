package jalau.at18.katas.pokerhands.roberto;

public class FourKindIdentifier {

    public static final int FOUR = 4;

    public boolean identify(PokerHand fourKindHand) {
        CardValuesCounter counter = new CardValuesCounter(fourKindHand);
        CardValuesCount count = counter.getCount();
        return count.exists(FOUR);
    }
}
