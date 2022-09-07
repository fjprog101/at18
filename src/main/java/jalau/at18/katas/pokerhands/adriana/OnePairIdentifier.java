package jalau.at18.katas.pokerhands.adriana;

public class OnePairIdentifier extends HandIdentifier {
    private static final int COUNT_FOR_HAND = 4;

    @Override
    boolean identify(PokerHand hand) {
        PairsCount pairsCount = new PairsCount(hand);
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return pairsCount.get() == 1 && count.getValuesCount().size() == COUNT_FOR_HAND;
    }
}

