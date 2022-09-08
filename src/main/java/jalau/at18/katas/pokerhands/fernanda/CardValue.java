package jalau.at18.katas.pokerhands.fernanda;

public enum CardValue {
    ACE(null, 1),
    KING(ACE, 13),
    QUEEN(KING, 12),
    JACK(QUEEN, 11),
    TEN(JACK, 10),
    NINE(TEN, 9),
    EIGHT(NINE, 8),
    SEVEN(EIGHT, 7),
    SIX(SEVEN, 6),
    FIVE(SIX, 5),
    FOUR(FIVE, 4),
    THREE(FOUR, 3),
    TWO(THREE, 2);

    private CardValue next;
    private int numvalue;

    CardValue(CardValue next, int numvalue) {
        this.next = next;
        this.numvalue = numvalue;
    }

    public CardValue next() {
        return next;
    }
    public int numValue() {
        return numvalue;
    }
}
