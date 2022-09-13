package jalau.at18.katas.pokerhands.sarai;

public enum CardValue {
    ACE(null),
    KING(ACE), //HIGH CARD
    QUEEN(KING),
    JACK(QUEEN),
    TEN(JACK),
    NINE(TEN),
    EIGHT(NINE),
    SEVEN(EIGHT),
    SIX(SEVEN),
    FIVE(SIX),
    FOUR(FIVE),
    THREE(FOUR),
    TWO(THREE);

    private CardValue next;

    CardValue(CardValue next) {
        this.next = next;
    }

    public CardValue next() {
        return next;
    }
}
