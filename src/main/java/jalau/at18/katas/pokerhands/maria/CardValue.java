package jalau.at18.katas.pokerhands.maria;

public enum CardValue {
    ACE(null, 14, 'A'),
    KING(ACE, 13, 'K'),
    QUEEN(KING, 12, 'Q'),
    JACK(QUEEN, 11, 'J'),
    TEN(JACK, 10, 'T'),
    NINE(TEN, 9, '9'),
    EIGHT(NINE, 8, '8'),
    SEVEN(EIGHT, 7, '7'),
    SIX(SEVEN, 6, '6'),
    FIVE(SIX, 5, '5'),
    FOUR(FIVE, 4, '4'),
    THREE(FOUR, 3, '3'),
    TWO(THREE, 2, '2');

    private CardValue next;
    private int realNumberValue;
    private char uiRepresentation;


    CardValue(CardValue next, int realNumberValue, char uiRepresentation) {
        this.next = next;
        this.realNumberValue = realNumberValue;
        this.uiRepresentation = uiRepresentation;
    }

    public CardValue next() {
        return next;
    }

    public int getRealNumberValue() {
        return realNumberValue;
    }

    public char getUIRepresentation() {
        return uiRepresentation;
    }
}
