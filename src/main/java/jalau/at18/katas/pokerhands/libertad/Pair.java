package jalau.at18.katas.pokerhands.libertad;

public class Pair extends CardsPattern {
    private final int sizeOfGroup = 4;
    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.getGroupSize() == sizeOfGroup;
    }
}