package jalau.at18.katas.pokerhands.libertad;

public class FourOfAKind extends CardsPattern {
    private final int groupSize = 2;
    private final int groupSizeWithSameValue = 4;
    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.getGroupSize() == groupSize && count.getBiggestSize() == groupSizeWithSameValue;
    }
}
