package jalau.at18.katas.bankocr.libertad;

import java.io.IOException;
import java.util.List;

public class BankOcr {
    private final int numberHexadecimal = 16;
    private List<String[]> numbers;
    private DigitValidator digitValidator;
    public BankOcr(InputNumber input) throws IOException {
        numbers = input.getSeparateHasNumbers();
        digitValidator = new DigitValidator();
    }

    public String readNumbers() {
        String number = "";
        for (int index = 0; index < numbers.size(); index++) {
            number += getValueOfNumber(numbers.get(index));
        }
        return number;
    }

    private char getValueOfNumber(String[] input) {
        if (digitValidator.existInTheRank(input)) {
            int valueNumber = digitValidator.getDigitValue(input);
            return Character.forDigit(valueNumber, numberHexadecimal);
        }
        return '?';
    }
}