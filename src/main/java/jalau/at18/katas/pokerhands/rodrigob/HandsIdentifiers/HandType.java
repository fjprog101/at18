package jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers;

import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public abstract class HandType {

    public abstract boolean identify(PokerHand hand);
    public abstract int getCardRankedValue(PokerHand hand);

}
