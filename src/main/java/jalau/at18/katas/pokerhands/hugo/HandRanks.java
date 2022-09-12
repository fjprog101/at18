package jalau.at18.katas.pokerhands.hugo;

public enum HandRanks {

    HIGHCARD(0),
    PAIR(1),
    TWOPAIRS(2),
    THREEOFAKIND(3),
    STRAIGHT(4),
    FLUSH(5),
    FULLHOUSE(6),
    FOUROFAKIND(7),
    STRAIGHTFLUSH(8);

    private int handRank;

    HandRanks(int handRank) {
        this.handRank = handRank;
    }

    public int getHandRank() {
        return handRank;
    }
}
