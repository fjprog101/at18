package jalau.at18.katas.pokerhands.rodrigov;
public class ThreeOfAKind extends CardsPattern{
    private final int threeOfAKind = 3;
    private final int differentCards = 1;


    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount count = cardValuesCounter.getCount();
        return count.exists(threeOfAKind) && count.exists(differentCards);
    }
}