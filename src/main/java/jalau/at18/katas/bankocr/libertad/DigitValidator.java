package jalau.at18.katas.bankocr.libertad;
public class DigitValidator {
    private DigitRange digitRange;
    public DigitValidator() {
        digitRange = new DigitRange();
    }
    public boolean existInTheRank(String[] input) {
        for (int iterator = 0; iterator < input.length; iterator++) {
            if (digitRange.isDigit(iterator, input)) {
                return true;
            }
        }
        return false;
    }
    public int getDigitValue(String[] input) {
        for (int iterator = 0; iterator < input.length; iterator++) {
            if (digitRange.isDigit(iterator, input)) {
                return iterator;
            }
        }
        return 0;
    }
}
