package jalau.at18.katas.bankocr.sergio;

import java.util.Arrays;

public class ConvertOcrToNumber {
    private int number;

    ConvertOcrToNumber() {
        number = 0;
    }

    public int analizeSingleNumbers(char[][] singleNumber) {
        for (Numbers numbers : Numbers.values()) {
            if (Arrays.deepEquals(singleNumber, numbers.getMatrixNumber())) {
                number = numbers.getNumberValue();
            }
        }
        return number;
    }
}
