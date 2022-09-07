package jalau.at18.katas.pokerhands.adriana;

public class TwoPairsIdentifier extends HandIdentifier {

    @Override
    boolean identify(PokerHand hand) {
        TwoPairsInHand haveTwoPairsInHand = new TwoPairsInHand();
        return haveTwoPairsInHand.match(hand);
    }
}
