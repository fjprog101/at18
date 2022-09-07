package jalau.at18.katas.pokerhands.adriana;

public class TwoPairsIdentifier extends HandIdentifier {

    @Override
    boolean identify(PokerHand hand) {
        PairsCount pairsCount = new PairsCount(hand);
        return pairsCount.get() == 2;
    }
}
