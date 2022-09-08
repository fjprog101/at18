package jalau.at18.katas.pokerhands.daniela;

public class FullHouse extends CardsPattern {
    public static final int THREE = 3;
    public static final int TWO = 2;

    public FullHouse() {

    }

    @Override
    public boolean match(PokerHand handWith3SimilarCards) {
        fullHouse(handWith3SimilarCards);
        return fullHouse(handWith3SimilarCards);
    }

    public boolean fullHouse(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount count = cardValuesCounter.getCount();
        return count.exists(THREE) && count.exists(TWO);
    }
}
