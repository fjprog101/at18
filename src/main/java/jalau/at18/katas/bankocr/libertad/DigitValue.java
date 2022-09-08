package jalau.at18.katas.bankocr.libertad;

public enum DigitValue {
    NINE(9, null),
    EIGTH(8, NINE),
    SEVEN(7, EIGTH),
    SIX(6, SEVEN),
    FIVE(5, SIX),
    FOUR(4, FIVE),
    THREE(3, FOUR),
    TWO(2, THREE),
    ONE(1, TWO),
    ZERO(0, ONE);
    private int value;
    private DigitValue nexDigitValue;
    DigitValue(int value, DigitValue nextDigitValue) {
        this.value = value;
        this.nexDigitValue = nextDigitValue;
    }
    public DigitValue getNexDigitValue() {
        return nexDigitValue;
    }
    public int getValue() {
        return value;
    }
}
