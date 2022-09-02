package jalau.at18.katas.bankocr.hugo;

import java.util.Arrays;

public class Ocr {

    public int getValue(char[][] digit) {
        for (Numbers num : Numbers.values()) {
            if (Arrays.deepEquals(num.getdigit(), digit)) {
                // System.out.println(num.getdigit());
                return num.getValue();
            }
        }
        return 0;
    }
}
