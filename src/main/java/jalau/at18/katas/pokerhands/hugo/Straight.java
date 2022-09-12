package jalau.at18.katas.pokerhands.hugo;

public class Straight extends HandIdentifier {

    private static final int NUMERIC_VALUES_LENGTH = 5;
    private PokerHandAnalizer analizer;
    private int[] numericValues;

    public Straight() {
        this.analizer = new PokerHandAnalizer();
        this.numericValues = new int[NUMERIC_VALUES_LENGTH];
    }

    @Override
    public boolean identify(PokerHand hand) {
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, consecutiveValues);
    }

    public int getRankedValue(PokerHand hand) {
        for (int index = 0; index < hand.getCards().length; index++) {
            numericValues[index] = hand.getCards()[index].getValue().getNumericValue();
        }
        return numericValues[NUMERIC_VALUES_LENGTH - 1];
    }
}
