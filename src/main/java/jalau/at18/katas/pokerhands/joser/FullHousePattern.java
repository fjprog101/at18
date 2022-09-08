package jalau.at18.katas.pokerhands.joser;

public class FullHousePattern extends CardsPattern {
    private final int amountThree = 3;
    private final int amountTwo = 2;

    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();

        if (count.exists(amountThree) && count.exists(amountTwo)) {
            return true;
        }

        return false;
    }
}
