package jalau.at18.katas.pokerhands.adriana.identifier;

import jalau.at18.katas.pokerhands.adriana.*;


public class FlushIdentifier extends HandIdentifier {
    private static final int LAST_CARD = 4;

    public FlushIdentifier() {
    }

    @Override
    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return allSameSuit.match(hand) && !consecutiveValues.match(hand);
    }

    @Override
    public HandKind getKind() {
        return HandKind.FLUSH;
    }

    @Override
    public int getHighest(PokerHand hand) {
        CardValue highestCard = hand.getCards()[LAST_CARD].getValue();
        return highestCard.get();
    }
}
