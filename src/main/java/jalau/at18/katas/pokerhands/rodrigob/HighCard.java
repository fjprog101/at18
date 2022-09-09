package jalau.at18.katas.pokerhands.rodrigob;


public class HighCard {

    private static final int MAX_ITERATIONS_NUMBER = 4;
    private int comparisonNumber;

    public HighCard(int comparisonNumber) {
        this.comparisonNumber = MAX_ITERATIONS_NUMBER - comparisonNumber;
    }

    public int getHighestCardValue(PokerHand hand) {
        return hand.getCards().get(comparisonNumber).getValue().getNumericValue();
    }

}
