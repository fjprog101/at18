package jalau.at18.katas.pokerhands.roberto;

public class ThreeKindIdentifier {

    public static final int THREE = 3;

    public boolean identify(PokerHand threeKindHand) {
        CardValuesCounter counter = new CardValuesCounter(threeKindHand);
        CardValuesCount count = counter.getCount();
        return count.exists(THREE);
    }
}
