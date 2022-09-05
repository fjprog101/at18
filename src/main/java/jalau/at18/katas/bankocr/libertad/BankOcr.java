package jalau.at18.katas.bankocr.libertad;

import java.io.IOException;
import java.util.List;

public class BankOcr {
    private List<String[]> numbers;
    public BankOcr(InputNumber input) throws IOException {
        numbers = input.getSeparateHasNumbers();
    }

    public String readNumbers() {
        String number = "";
        for (int i = 0; i < numbers.size(); i++) {
           number += getValueOfNumber(i); 
        }
        return number;
    }

    private char getValueOfNumber(int i) {
        DigitValidator digitValidator = new DigitValidator();
        if (digitValidator.existInTheRank(numbers.get(i))) {
            int valueNumber = digitValidator.getDigit().getValue();
            return Character.forDigit(valueNumber,16);
        }
        return '?';
    }
}