package jalau.at18.katas.pokerhands.joser;

public class FourKindPattern extends CardsPattern {
    private final int amountOfCartas = 4;

    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();

        return count.exists(amountOfCartas)? true : false;
      
    }
}
