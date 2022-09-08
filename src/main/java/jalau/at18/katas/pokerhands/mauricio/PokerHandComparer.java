package jalau.at18.katas.pokerhands.mauricio;

public class PokerHandComparer {

    public boolean comparer(PokerHand hand, IndetifyHand indetifyHand) {
        return indetifyHand.identify(hand);
    }
}
