package jalau.at18.katas.pokerhands.adriana.identifier;

import jalau.at18.katas.pokerhands.adriana.*;

public class StraightIdentifier extends HandIdentifier {

    public StraightIdentifier() {
    }

    @Override
    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return !allSameSuit.match(hand) && consecutiveValues.match(hand);
    }

    @Override
    public HandKind getKind() {
        return HandKind.STRAIGHT;
    }
}
