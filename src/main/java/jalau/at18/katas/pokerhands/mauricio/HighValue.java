package jalau.at18.katas.pokerhands.mauricio;

public class HighValue extends ValuesPattern {
    @Override
    public int totalCardValue(PokerHand hand) {
        int expectedCount = 0;
        for (int index = 0; index < hand.getCards().length - 1; index++) {
            expectedCount = expectedCount + hand.getCards()[index].getValue().ordinal();
        }
        return expectedCount;
    }
}
