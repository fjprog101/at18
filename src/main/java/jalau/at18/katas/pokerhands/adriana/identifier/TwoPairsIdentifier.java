package jalau.at18.katas.pokerhands.adriana.identifier;

import jalau.at18.katas.pokerhands.adriana.*;

public class TwoPairsIdentifier extends HandIdentifier {

    public TwoPairsIdentifier() {
    }

    @Override
    public boolean identify(PokerHand hand) {
        PairsCount pairsCount = new PairsCount(hand);
        return pairsCount.get() == 2;
    }

    @Override
    public HandKind getKind() {
        return HandKind.TWO_PAIRS;
    }
}
