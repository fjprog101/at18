package jalau.at18.katas.bankocr.libertad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberRange {
    DigitRepresentation digitRepresentation;
    List<Digit> digits;
    public NumberRange(){
        digits = new ArrayList<>();
        digitRepresentation = new DigitRepresentation();
        fillDigits();
    }
    private void fillDigits() {
        List<String[][]> stringsNumbers = digitRepresentation.getDigitsRepresentation();
        for(int iterator = 0; iterator < stringsNumbers.size(); iterator++) {
            Digit digit = new Digit(iterator,stringsNumbers.get(iterator));
            digits.add(digit);
        }
    }
    public boolean existInTheRank(String[][] input){
        boolean exist = false;
        for(int iterator = 0; iterator < digits.size() && !exist; iterator++) {
            exist = compare(digits.get(iterator).getRepresentation(),input);
        }
        return exist;
    }
    public boolean compare(String[][] strings, String[][] input) {
        boolean isEquals = false;
        if(Arrays.deepEquals(strings, input)) {
            isEquals = true;
        }
        return isEquals;
    }
    public int getIntValue(String[][] input){
        for(int iterator = 0; iterator < digits.size(); iterator++) {
            if(compare(digits.get(iterator).getRepresentation(),input)) {
                return iterator;
            }
        }
        return 0;
    }
}
