package jalau.at18.katas.pokerhands.rodrigob;

public enum HandsValue {

    ONEPAIR(1, new OnePairIdentifier()),
    TWOPAIRS(2, new TwoPairsIdentifier()),
    THREEOFAKIND(3, new ThreeWithSameValueIdentifier()),
    STRAIGHT(4, new StraightIdentifier()),
    FLUSH(5, new FlushIdentifier()),
    FULLHOUSE(6, new FullHouseIdentifier()),
    FOUROFAKIND(7, new FourWithSameValueIdentifier()),
    STRAIGHTFLUSH(8, new StraightFlushIdentifier());

    private int rank;
    private HandType handType;

    HandsValue(int rank, HandType handType) {
        this.rank = rank;
        this.handType = handType;
    }

    public int getRank() {
        return rank;
    }

    public HandType getHandType() {
        return handType;
    }
}
