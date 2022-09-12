package jalau.at18.katas.pokerhands.adriana.identifier;

import jalau.at18.katas.pokerhands.adriana.*;

public class TwoPairsIdentifier extends HandIdentifier {
    private static final int PAIR = 2;

    public TwoPairsIdentifier() {
    }

    @Override
    public boolean identify(PokerHand hand) {
        PairsCount pairsCount = new PairsCount(hand);
        return pairsCount.get() == 2;
    }

    @Override
    public HandKind getKind() {
        return HandKind.TWO_PAIRS;
    }

    @Override
    public int getCardWithPatternValue(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        CardValue repeatedCard = getRepeatedCard(count, PAIR);
        return repeatedCard.get();
    }
}
