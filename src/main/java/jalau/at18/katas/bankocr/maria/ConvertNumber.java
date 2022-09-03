package jalau.at18.katas.bankocr.maria;

import jalau.at18.katas.bankocr.maria.Numbers.*;
import java.util.List;

public class ConvertNumber {
    private static final int INITIAL_VALUE = -1;
    private SetNumberToConvert setNumberToConvert = new SetNumberToConvert();

    public int convert(String firstColumn, String secondColumn, String thirdColumn) {
        int number = INITIAL_VALUE;
        List<TypeNumber> numbers = setNumberToConvert.saveTypeNumber();
        for (TypeNumber typeNumber : numbers) {
            if (typeNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
                number = typeNumber.getValue();
            }
        }
        return number;
    }
}
