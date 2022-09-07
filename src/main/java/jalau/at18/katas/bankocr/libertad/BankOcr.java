package jalau.at18.katas.bankocr.libertad;

import java.io.IOException;
import java.util.List;

public class BankOcr {
    private final int numberHexadecimal = 16;
    private List<String[]> numbers;
    public BankOcr(InputNumber input) throws IOException {
        numbers = input.getSeparateHasNumbers();
    }

    public String readNumbers() {
        String number = "";
        for (int index = 0; index < numbers.size(); index++) {
            number += getValueOfNumber(index);
        }
        return number;
    }

    private char getValueOfNumber(int index) {
        DigitValidator digitValidator = new DigitValidator();
        if (digitValidator.existInTheRank(numbers.get(index))) {
            int valueNumber = digitValidator.getDigit().getValue();
            return Character.forDigit(valueNumber, numberHexadecimal);
        }
        return '?';
    }
}