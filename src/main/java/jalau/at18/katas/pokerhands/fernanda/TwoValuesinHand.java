package jalau.at18.katas.pokerhands.fernanda;

public class TwoValuesinHand extends CardsPattern {
    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.sizeOfGroup() == 2;
    }
}
