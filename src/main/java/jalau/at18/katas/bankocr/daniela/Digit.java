package jalau.at18.katas.bankocr.daniela;

public class Digit {
    private final String line1;
    private final String line2;
    private final String line3;

    public Digit(String line1, String line2, String line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    public char getDigitChar() {
        for (ValuesNumbers number : ValuesNumbers.values()) {
            if (this.hasSameLinesAs(number)) {
                return number.getCharValue();
            }
        }
        return 'a';
    }

    private boolean hasSameLinesAs(ValuesNumbers number) {
        return (this.line1.equals(number.getLine1()) && this.line2.equals(number.getLine2())
                && this.line3.equals(number.getLine3()));
    }
}
