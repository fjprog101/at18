package jalau.at18.katas.pokerhands.adriana.identifier;

import jalau.at18.katas.pokerhands.adriana.*;

public class OnePairIdentifier extends HandIdentifier {
    private static final int COUNT_FOR_HAND = 4;
    private static final int PAIR = 2;

    public OnePairIdentifier() {
    }

    @Override
    public boolean identify(PokerHand hand) {
        PairsCount pairsCount = new PairsCount(hand);
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return pairsCount.get() == 1 && count.getValuesCount().size() == COUNT_FOR_HAND;
    }

    @Override
    public HandKind getKind() {
        return HandKind.PAIR;
    }
    @Override
    public int getHighest(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        CardValue repeatedCard = getRepeatedCard(count, PAIR);
        return repeatedCard.get();
    }
}

