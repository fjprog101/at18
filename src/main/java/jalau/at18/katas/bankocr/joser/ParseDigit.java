package jalau.at18.katas.bankocr.joser;

import java.util.Arrays;

public class ParseDigit {
    private String[] digit;
    private String value;

    public ParseDigit(String[] digit) {
        this.digit = digit;
        this.value = "?";
    }

    public String getValue() {
        for (Digits number : Digits.values()) {
            // return compare(digit, number.getCharacters())? number.ordinal() + "": value;
            if (Arrays.deepEquals(digit, number.getCharacters())) {
                return number.ordinal() + "";
            }
        }
        return value;
    }

    public Boolean compare(String[] digitN, String[] number) {
        if (Arrays.deepEquals(digitN, number)) {
            return true;
        }
        return false;
    }

}
