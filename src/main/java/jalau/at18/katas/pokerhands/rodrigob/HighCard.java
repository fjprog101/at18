package jalau.at18.katas.pokerhands.rodrigob;

import java.util.Arrays;

public class HighCard {

    private static final int MAX_ITERATIONS_NUMBER = 4;
    private static final int NUMERIC_VALUES_LENGTH = 5;
    private int[] numericValues;
    private int comparisonNumber;

    public HighCard(int comparisonNumber) {
        this.numericValues = new int[NUMERIC_VALUES_LENGTH];
        this.comparisonNumber = MAX_ITERATIONS_NUMBER - comparisonNumber;
    }

    public int getHighestCardValue(PokerHand hand) {
        for (int index = 0; index < hand.getCards().length; index++) {
            numericValues[index] = hand.getCards()[index].getValue().getNumericValue();
        }
        Arrays.sort(numericValues);
        return numericValues[comparisonNumber];
    }

}
