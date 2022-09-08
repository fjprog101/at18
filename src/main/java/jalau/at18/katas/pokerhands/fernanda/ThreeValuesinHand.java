package jalau.at18.katas.pokerhands.fernanda;

public class ThreeValuesinHand extends CardsPattern {
    private final int sizeOfGroup = 3;

    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.sizeOfGroup() == sizeOfGroup;
    }
}
