package jalau.at18.katas.bankocr.daniela;

public class DigitValid {
    private final String line1;
    private final String line2;
    private final String line3;
    private String result;

    public DigitValid(String line1, String line2, String line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.result = "";
    }

    public String getDigitChar() {
        for (ValuesNumbers number : ValuesNumbers.values()) {
            if (hasSameLinesAs(number, 0)) {
                result += number.getCharValue();
            }
        }
        return result;
    }

    private boolean hasSameLinesAs(ValuesNumbers number, int cont) {
        return this.line1.equals(number.getLine1()) && this.line2.equals(number.getLine2())
                || this.line2.equals(number.getLine2()) && this.line3.equals(number.getLine3())
                || this.line1.equals(number.getLine1()) && this.line3.equals(number.getLine3());
    }
}
