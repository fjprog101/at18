package jalau.at18.katas.pokerhands.adriana.identifier;

import jalau.at18.katas.pokerhands.adriana.*;

public class ThreeOfAKindIdentifier extends HandIdentifier {
    private static final int THREE_OF_A_KIND = 3;

    public ThreeOfAKindIdentifier() {
    }

    @Override
    public boolean identify(PokerHand hand) {
        PairsCount pairsCount = new PairsCount(hand);
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(THREE_OF_A_KIND) && pairsCount.get() == 0;
    }

    @Override
    public HandKind getKind() {
        return HandKind.THREE_EQUALS;
    }

    @Override
    public int getHighest(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        CardValue repeatedCard = getRepeatedCard(count, THREE_OF_A_KIND);
        return repeatedCard.get();
    }
}
