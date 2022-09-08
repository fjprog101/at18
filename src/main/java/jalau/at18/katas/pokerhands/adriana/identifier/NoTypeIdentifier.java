package jalau.at18.katas.pokerhands.adriana.identifier;

import jalau.at18.katas.pokerhands.adriana.*;

public class NoTypeIdentifier extends HandIdentifier {
    private static final int LAST_CARD = 4;
    @Override
    public boolean identify(PokerHand hand) {
        return true;
    }

    @Override
    public HandKind getKind() {
        return HandKind.NONE;
    }

    @Override
    public int getHighest(PokerHand hand) {
        CardValue highestCard = hand.getCards()[LAST_CARD].getValue();
        return highestCard.get();
    }

}
