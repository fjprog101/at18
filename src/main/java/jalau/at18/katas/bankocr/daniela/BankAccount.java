package jalau.at18.katas.bankocr.daniela;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private static final int SIZE_NUMBERS = 27;
    private static final int ZISE = 3;
    private static final int CAPACITY = 9;
    private List<Digit> digits = new ArrayList<Digit>(CAPACITY);
    private StringBuilder totaldigits = new StringBuilder();

    public BankAccount(String line1, String line2, String line3) {
        extractDigits(line1, line2, line3);
    }

    private void extractDigits(String line1, String line2, String line3) { // break the 9digits of entry
        for (int searchminvalue = 0; searchminvalue < SIZE_NUMBERS; searchminvalue += ZISE) {
            digits.add(new Digit(chunkLine1(line1, line2, line3, searchminvalue),
                    chunkLine2(line1, line2, line3, searchminvalue), chunkLine3(line1, line2, line3, searchminvalue)));
        }
    }

    public String getDigitChar() {
        for (Digit digit : digits) {
            totaldigits.append(digit.getDigitChar());
        }
        return totaldigits.toString();
    }

    public String chunkLine1(String line1, String line2, String line3, int searchminvalue) {
        return line1.substring(searchminvalue, searchminvalue + ZISE);
    }

    public String chunkLine2(String line1, String line2, String line3, int searchminvalue) {
        return line2.substring(searchminvalue, searchminvalue + ZISE);
    }

    public String chunkLine3(String line1, String line2, String line3, int searchminvalue) {
        return line3.substring(searchminvalue, searchminvalue + ZISE);
    }
}