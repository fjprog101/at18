package jalau.at18.katas.pokerhands.adriana;

public enum CardValue {
    ACE(null, 14),
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
    private int value;

    CardValue(CardValue next, int value) {
        this.value = value;
        this.next = next;
    }

    public CardValue next() {
        return next;
    }
    public int get() {
        return value;
    }
}
