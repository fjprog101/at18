package jalau.at18.katas.bankocr.rodrigob;

import java.util.Arrays;

public class CompareDigits {
    private String digit = "";
    private boolean isDigit = false;

    public CompareDigits() {
    }

    public String getDigitString(char[][] number) {
        compareAllDigits(number);
        String digitout = isDigit ? getDigit() : "?";
        this.isDigit = false;
        return digitout;
    }

    public void compareAllDigits(char[][] number) {
        for (DigitValue list: DigitValue.values()) {
            verifyValidDigits(number, list);
        }
    }
    public void verifyValidDigits(char[][] number, DigitValue list) {
        if (Arrays.deepEquals(number, list.getValue())) {
            this.digit = list.getDigit();
            this.isDigit = true;
        }
    }

    public String getDigit() {
        return digit;
    }

}
