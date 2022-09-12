package jalau.at18.katas.pokerhands.hugo;

public enum HandRanks {

    //HIGHCARD(0),
    PAIR(1, new OnePair()),
    TWOPAIRS(2, new TwoPair()),
    THREEOFAKIND(3, new ThreeKind()),
    STRAIGHT(4, new Straight()),
    FLUSH(5, new Flush()),
    FULLHOUSE(6, new FullHouse()),
    FOUROFAKIND(7, new FourKind()),
    STRAIGHTFLUSH(8, new StraightFlushIdentifier());

    private int handRank;
    private HandIdentifier hand;

    HandRanks(int handRank, HandIdentifier hand) {
        this.handRank = handRank;
        this.hand = hand;
    }

    public int getHandRank() {
        return handRank;
    }

    public HandIdentifier getHandType() {
        return hand;
    }
}
