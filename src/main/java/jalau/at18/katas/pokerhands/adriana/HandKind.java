package jalau.at18.katas.pokerhands.adriana;

import jalau.at18.katas.pokerhands.adriana.identifier.*;

public enum HandKind {
    PAIR(new OnePairIdentifier()),
    TWO_PAIRS(new TwoPairsIdentifier()),
    THREE_EQUALS(new ThreeOfAKindIdentifier()),
    STRAIGHT(new StraightIdentifier()),
    FLUSH(new FlushIdentifier()),
    FULL_HOUSE(new FullHouseIdentifier()),
    FOUR_EQUALS(new FourOfAKindIdentifier()),
    STRAIGHT_FLUSH(new StraightFlushIdentifier());

    private HandIdentifier handIdentifier;
    HandKind(HandIdentifier handIdentifier) {
        this.handIdentifier = handIdentifier;
    }

    public HandIdentifier getIdentifier() {
        return handIdentifier;
    }
}
