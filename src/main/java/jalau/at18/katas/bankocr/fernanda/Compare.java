package jalau.at18.katas.bankocr.fernanda;

import java.util.Arrays;

public class Compare {

    public char compareDig(char[][] numberToCompare) {
        for (Numbers num: Numbers.values()) {
            if (Arrays.deepEquals(num.getNumber(), numberToCompare)) {
                return num.getNumRep();
            }
        }
        return ' ';
    }
}
