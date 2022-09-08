package jalau.at18.katas.pokerhands.adriana;

public class FourOfAKindIdentifier extends HandIdentifier {
    private static final int FOUR_OF_A_KIND = 4;

    public FourOfAKindIdentifier() {
    }

    @Override
    boolean identify(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(FOUR_OF_A_KIND);
    }

    @Override
    HandKind getKind() {
        return HandKind.FOUR_EQUALS;
    }
}
