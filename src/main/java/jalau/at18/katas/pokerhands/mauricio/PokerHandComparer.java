package jalau.at18.katas.pokerhands.mauricio;

public class PokerHandComparer {

    public boolean comparer(PokerHand hand, IndetifyHand indetifyHand) {
        return indetifyHand.identify(hand);
    }

    public boolean compareValues(PokerHand blackHand, PokerHand whiteHand, ValuesPattern valuesPattern) {
        return valuesPattern.totalCardValue(blackHand) < valuesPattern.totalCardValue(whiteHand);
    }
}
