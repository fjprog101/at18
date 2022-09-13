package jalau.at18.katas.bankocr.daniela;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private static final int SIZEONEDIGIT = 3;
    private static final int CAPACITY = 9;
    private List<Digit> digits = new ArrayList<Digit>(CAPACITY);
    private StringBuilder totaldigits = new StringBuilder();

    public BankAccount(String line1, String line2, String line3, int sizenumbers) {
        extractDigits(line1, line2, line3, sizenumbers);
    }

    private void extractDigits(String line1, String line2, String line3, int sizenumbers) {
        for (int searchminvalue = 0; searchminvalue < sizenumbers; searchminvalue += SIZEONEDIGIT) {
            digits.add(new Digit((line1.substring(searchminvalue, searchminvalue + SIZEONEDIGIT)),
                    (line2.substring(searchminvalue, searchminvalue + SIZEONEDIGIT)),
                    (line3.substring(searchminvalue, searchminvalue + SIZEONEDIGIT))));
        }
    }

    public String getDigitChar() {
        for (Digit digit : digits) {
            totaldigits.append(digit.getDigitChar());
        }
        return totaldigits.toString();
    }

}