package jalau.at18.katas.pokerhands.hugo;

public enum CardValue {
    ACE(null, 13),
    KING(ACE, 12),
    QUEEN(KING, 11),
    JACK(QUEEN, 10),
    TEN(JACK, 9),
    NINE(TEN, 8),
    EIGHT(NINE, 7),
    SEVEN(EIGHT, 6),
    SIX(SEVEN, 5),
    FIVE(SIX, 4),
    FOUR(FIVE, 3),
    THREE(FOUR, 2),
    TWO(THREE, 1);

    private CardValue next;
    private int value;

    CardValue(CardValue next, int value) {
        this.next = next;
        this.value = value;
    }

    public CardValue next() {
        return next;
    }

    public int getNumericValue() {
        return value;
    }
}
