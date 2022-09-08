package jalau.at18.katas.bankocr.libertad;
import java.util.Arrays;
public class DigitValidator {
    private Digit digit;
    public DigitValidator() {
        digit = Digit.ZERO;
    }
    public boolean existInTheRank(String[] input) {
        boolean exist = false;
        while (digit.hasNext() && !exist) {
            exist = compare(digit.getRepresentation(), input);
            digit = digit.getNextDigit();
        }
        return exist;
    }
    public boolean compare(String[] strings, String[] input) {
        boolean isEquals = false;
        if (Arrays.deepEquals(strings, input)) {
            isEquals = true;
        }
        return isEquals;
    }
    public Digit getDigit() {
        return digit;
    }
}
