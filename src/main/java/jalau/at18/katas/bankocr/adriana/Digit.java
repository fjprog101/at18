package jalau.at18.katas.bankocr.adriana;

import java.util.Arrays;

public class Digit {
    private String[][] digit;
    private String value;

    public Digit(String[][] digit) {
        this.digit = digit;
        value = "-1";
        setValue();
    }
    public String getValue() {
        return value;
    }
    public void setValue() {
        for (DigitType number : DigitType.values()) {
            if (Arrays.deepEquals(digit, number.getArray())) {
                value = "" + number.ordinal();
            }
        }
    }
    public String[][] getDigit() {
        return digit;
    }
}
