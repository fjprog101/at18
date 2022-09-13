package jalau.at18.katas.pokerhands.adriana.identifier;

import jalau.at18.katas.pokerhands.adriana.*;

public class StraightIdentifier extends HandIdentifier {
    private static final int LAST_CARD = 4;

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

    @Override
    public int getCardWithPatternValue(PokerHand hand) {
        CardValue highestCard = hand.getCards()[LAST_CARD].getValue();
        return highestCard.get();
    }
}
