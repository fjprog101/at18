package jalau.at18.katas.bankocr.joser;

import java.util.Arrays;

public class ParseDigit {
    private String[] digit;
    private int value;

    public ParseDigit(String[] digit) {
        this.digit = digit;
    }

    public int getValue() {
        for (Digits number : Digits.values()) {
            if (Arrays.deepEquals(digit, number.getCharacters())) {
                this.value = number.ordinal();
            }
        }
        return value;
    }

}
