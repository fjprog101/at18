package jalau.at18.katas.pokerhands.adriana;

public class FullHouseIdentifier extends HandIdentifier {
    private static final int THREE_OF_A_KIND = 3;

    @Override
    boolean identify(PokerHand hand) {
        PairsCount pairsCount = new PairsCount(hand);
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(THREE_OF_A_KIND) && pairsCount.get() == 1;
    }
}
