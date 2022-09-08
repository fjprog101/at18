package jalau.at18.katas.bankocr.daniela;

import java.util.ArrayList;
import java.util.List;

public class BankAccount extends Separatedigits {
    private static final int ZISE = 3;
    private static final int CAPACITY = 9;
    private List<Digit> digits = new ArrayList<Digit>(CAPACITY);
    private StringBuilder totaldigits = new StringBuilder();

    public BankAccount(String line1, String line2, String line3, int sizenumbers) {
        super(line1, line2, line3);
        extractDigits(line1, line2, line3, sizenumbers);
    }

    private void extractDigits(String line1, String line2, String line3, int sizenumbers) {
        for (int searchminvalue = 0; searchminvalue < sizenumbers; searchminvalue += ZISE) {
            digits.add(new Digit(hasSameLinesAs1(line1, searchminvalue),
                    hasSameLinesAs2(line2, searchminvalue), hasSameLinesAs3(line3, searchminvalue)));
        }
    }

    public String getDigitChar() {
        for (Digit digit : digits) {
            totaldigits.append(digit.getDigitChar());
        }
        return totaldigits.toString();
    }
}