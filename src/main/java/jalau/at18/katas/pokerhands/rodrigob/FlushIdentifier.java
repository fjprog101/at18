package jalau.at18.katas.pokerhands.rodrigob;

public class FlushIdentifier extends HandType {

    private static final int NUMERIC_VALUES_LENGTH = 5;
    private PokerHandAnalizer analizer;
    private int[] numericValues;

    public FlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
        this.numericValues = new int[NUMERIC_VALUES_LENGTH];
    }

    @Override
    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        return analizer.analize(hand, allSameSuit);
    }

    @Override
    public int getCardRankedValue(PokerHand hand) {
        for (int index = 0; index < hand.getCards().length; index++) {
            numericValues[index] = hand.getCards()[index].getValue().getNumericValue();
        }
        return numericValues[NUMERIC_VALUES_LENGTH - 1];
    }

}
