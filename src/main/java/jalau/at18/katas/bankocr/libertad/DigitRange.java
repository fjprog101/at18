package jalau.at18.katas.bankocr.libertad;
import java.util.LinkedList;
import java.util.List;
public class DigitRange {
    private final int maxValue = 9;
    private List<Digit> digits;
    private Comparator comparator;
    DigitRange() {
        digits = new LinkedList<>();
        comparator = new Comparator();
        fillWithDigits();
    }
    private void fillWithDigits() {
        Digit digit = Digit.ZERO;
        for (int iterator = 0; iterator <= maxValue; iterator++) {
            digits.add(digit);
            digit = digit.getNext();
        }
    }
    public boolean isDigit(int index, String[] input) {
        if (comparator.compare(digits.get(index).getRepresentation(), input)) {
            return true;
        }
        return false;
    }
    public List<Digit> getDigits() {
        return digits;
    }
}
