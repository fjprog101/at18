package jalau.at18.katas.bankocr.sergio;

import java.util.Arrays;

public class OpticCharacterReader {

    public int analizeSingleNumbers(char[][] singleNumber) {
        for (Numbers number : Numbers.values()) {
            if (Arrays.deepEquals(singleNumber, number.getMatrixNumber())) {
                return number.getNumberValue();
            }
        }
        return 0;
    }
}
