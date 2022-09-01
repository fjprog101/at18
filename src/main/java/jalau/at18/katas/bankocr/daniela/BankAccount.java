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
            String chunk1 = line1.substring(searchminvalue, searchminvalue + ZISE);
            String chunk2 = line2.substring(searchminvalue, searchminvalue + ZISE);
            String chunk3 = line3.substring(searchminvalue, searchminvalue + ZISE);
            digits.add(new Digit(chunk1, chunk2, chunk3));
        }
    }

    public String getDigitChar() {
        for (Digit digit : digits) {
            totaldigits.append(digit.getDigitChar());
        }
        return totaldigits.toString();
    }
}