package jalau.at18.katas.bankocr.libertad;

import java.util.ArrayList;
import java.util.List;

public class DigitRepresentation {
    private static final String[][] ZERO = {{" _ "},
                                            {"| |"},
                                            {"|_|"}};
    private static final String[][] ONE = {{"   "},
                                           {"  |"},
                                           {"  |"}};
    private static final String[][] TWO = {{" _ "},
                                           {" _|"},
                                           {"|_ "}};
    private static final String[][] THREE = {{" _ "},
                                             {" _|"},
                                             {" _|"}};
    private static final String[][] FOUR = {{"   "},
                                            {"|_|"},
                                            {"  |"}};
    private static final String[][] FIVE = {{" _ "},
                                            {"|_ "},
                                            {" _|"}};
    private List<String[][]> digits;
    public DigitRepresentation() {
        digits = new ArrayList<>();
        digits.add(ZERO);
        digits.add(ONE);
        digits.add(TWO);
        digits.add(THREE);
        digits.add(FOUR);
        digits.add(FIVE);
    }
    public List<String[][]> getDigitsRepresentation() {
        return digits;
    }
}
