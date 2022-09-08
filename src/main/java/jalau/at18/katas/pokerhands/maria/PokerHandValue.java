package jalau.at18.katas.pokerhands.maria;

public enum PokerHandValue {
    STRAIGHTFLUSH(9),
    FOURKIND(8),
    FULLHOUSE(7),
    FLUSH(6),
    STRAIGHT(5),
    THREEKIND(4),
    TWOPAIRS(3),
    PAIR(2),
    HIGHCARD(1);

    private int pokerHandvalue;

    PokerHandValue(int pokerHandvalue) {
        this.pokerHandvalue = pokerHandvalue;
    }

    public int getPokerHandvalue() {
        return pokerHandvalue;
    }
}
