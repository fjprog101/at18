package jalau.at18.katas.pokerhands.rodrigob;

public enum HandsValue {
    STRAIGHTFLUSH(8),
    FOUROFAKIND(7),
    FULLHOUSE(6),
    FLUSH(5),
    STRAIGHT(4),
    THREEOFAKIND(3),
    TWOPAIRS(2),
    ONEPAIR(1);

    private int handRange;

    HandsValue(int handRange) {
        this.handRange = handRange;
    }

    public int getHandRange() {
        return handRange;
    }
}
