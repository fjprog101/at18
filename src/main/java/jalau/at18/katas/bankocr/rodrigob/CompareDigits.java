package jalau.at18.katas.bankocr.rodrigob;

import java.util.Arrays;

public class CompareDigits {
    //private DigitValue value;
    //private static final int MAXIMUM_VALUES = 10;
    //private String output ="";
    private String digit = "";
    public CompareDigits() {
    }

    public String getDigitString(char[][] number) {
        compareAllDigits(number);
        return getDigit();
    }
    public void compareAllDigits(char[][] number) {
        for (DigitValue list: DigitValue.values()) {
            if (Arrays.deepEquals(number, list.getValue())) {
                this.digit = list.getDigit();
            }
        }
    }
    public String getDigit() {
        return digit;
    }

}
