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

    public boolean areErrors(char[] accNum, int colpos) {
        for (int index = 0; index < colpos; index++) {
            if (accNum[index] == '?') {
                return true;
            }
        }
        return false;
    }
}
