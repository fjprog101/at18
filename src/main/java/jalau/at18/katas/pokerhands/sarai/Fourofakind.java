package jalau.at18.katas.pokerhands.sarai;
public class Fourofakind extends CardsPattern {

    private final int pairsnumbersFour = 4;;

    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        return count.exists(pairsnumbersFour);
    }
}
