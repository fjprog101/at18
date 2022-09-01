package jalau.at18.katas.bankocr.rodrigob;

import java.util.Arrays;

public class WriterDigits {
    //private DigitValue value;

    public WriterDigits(char[][] number) {
    }

    public String compareDigits(char[][] number, char[][] value) {
        for (DigitValue list: DigitValue.values()) {
            if (Arrays.deepEquals(number, list.getValue())) {
                return list.getDigit();
            }
        }
        return "";
    }

}
