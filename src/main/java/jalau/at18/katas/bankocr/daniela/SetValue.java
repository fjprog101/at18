package jalau.at18.katas.bankocr.daniela;

import java.util.Arrays;

public class SetValue {
    private String[][] digit;
    private int valueNumber;

    public SetValue(String[][] digit) {
        this.digit = digit;
        setValue();
    }

    public int getValue() {
        return valueNumber;
    }

    public void setValue() {
        for (ValuesNumbers number : ValuesNumbers.values()) {
            if (Arrays.deepEquals(digit, number.getCharactersNumbers())) {
                valueNumber = number.ordinal();
            }
        }
    }

}
