package jalau.at18.katas.pokerhands.adriana;

public class ThreeOfAKindIdentifier extends HandIdentifier {

    private static final int THREE_OF_A_KIND = 3;

    public ThreeOfAKindIdentifier() {
    }

    @Override
    boolean identify(PokerHand hand) {
        PairsCount pairsCount = new PairsCount(hand);
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(THREE_OF_A_KIND) && pairsCount.get() == 0;
    }

    @Override
    HandKind getKind() {
        return HandKind.THREE_EQUALS;
    }
}
