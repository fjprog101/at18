package jalau.at18.katas.pokerhands.hugo;

import java.util.Arrays;

public class HighCard {
    private static final int HAND_SIZE = 5;
    private static final int MAX_ITERATIONS = 4;
    private int[] numericValues;
    private int comparisonNumber;

    public HighCard(int comparisonNumber) {
        this.numericValues = new int[HAND_SIZE];
        this.comparisonNumber = MAX_ITERATIONS - comparisonNumber;
    }

    public int getHighestCardValue(PokerHand hand) {
        for (int index = 0; index < hand.getCards().length; index++) {
            numericValues[index] = hand.getCards()[index].getValue().getNumericValue();
        }
        Arrays.sort(numericValues);
        return numericValues[comparisonNumber];
    }
}