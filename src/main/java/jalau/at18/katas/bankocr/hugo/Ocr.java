package jalau.at18.katas.bankocr.hugo;

import java.util.Arrays;

public class Ocr {

    public char getValue(char[][] digit) {
        for (Numbers num : Numbers.values()) {
            if (Arrays.deepEquals(num.getdigit(), digit)) {
                return num.getValue();
            }
        }
        return '?';
    }
}
