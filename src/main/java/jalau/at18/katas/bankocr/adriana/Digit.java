package jalau.at18.katas.bankocr.adriana;

import java.util.Arrays;

public class Digit {
    private String[][] digit;
    private int value;

    public Digit(String[][] digit) {
        this.digit = digit;
        value = -1;
        setValue();
    }
    public int getValue() {
        return value;
    }
    public void setValue() {
        for (DigitType number : DigitType.values()) {
            if (Arrays.deepEquals(digit, number.getArrayCharacters())) {
                value = number.ordinal();
            }
        }
    }
}
