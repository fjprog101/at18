package jalau.at18.katas.bankocr.libertad;
import java.util.HashMap;
import java.util.Map;
public class DigitRange {
    private Map<Integer, Digit> digits;
    private Comparator comparator;
    DigitRange(){
        digits = new HashMap<>();
        comparator = new Comparator();
        fillWithDigits(Digit.ZERO);
    }
    private void fillWithDigits(Digit digit) {
        int value = 0;
        do {
            digits.put(value, digit);
            value++;
        } while (digit.hasNext());
    }
    public boolean isDigit(int index, String[] input) {
        if (comparator.compare(digits.get(index).getRepresentation(), input)) {
            return true;
        }
        return false;
    }
    public Map<Integer, Digit> getDigits() {
        return digits;
    }
}
