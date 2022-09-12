package jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers;

import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class HighCardIdentifier extends HandType {

    private static final int SIZE_CARD_LIST = 5;

    @Override
    public
    boolean identify(PokerHand hand) {
        return true;
    }

    @Override
    public
    int getCardRankedValue(PokerHand hand) {
        return hand.getCards().get(SIZE_CARD_LIST - 1).getValue().getNumericValue();
    }

}
