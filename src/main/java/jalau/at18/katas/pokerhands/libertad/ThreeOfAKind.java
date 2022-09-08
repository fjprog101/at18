package jalau.at18.katas.pokerhands.libertad;

public class ThreeOfAKind extends CardsPattern {
    private final int groupSize = 3;
    private final int groupSizeWithSameValue = 3;
    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.getGroupSize() == groupSize && count.getBiggestSize() == groupSizeWithSameValue;
    }
}
