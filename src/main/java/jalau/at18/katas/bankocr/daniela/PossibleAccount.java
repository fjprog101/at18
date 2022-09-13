package jalau.at18.katas.bankocr.daniela;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PossibleAccount {
    private static final int SIZEONEDIGIT = 3;
    private static final int CAPACITY = 9;
    private List<DigitValid> digits = new ArrayList<DigitValid>(CAPACITY);
    private List<String> digitpossible = new ArrayList<String>(CAPACITY);
    private SetPossibleDigit possible = new SetPossibleDigit();

    public PossibleAccount(String line1, String line2, String line3, int sizenumbers) {
        extractDigits(line1, line2, line3, sizenumbers);
    }

    private void extractDigits(String line1, String line2, String line3, int sizenumbers) {
        for (int searchminvalue = 0; searchminvalue < sizenumbers; searchminvalue += SIZEONEDIGIT) {
            digits.add(new DigitValid((line1.substring(searchminvalue, searchminvalue + SIZEONEDIGIT)),
                    (line2.substring(searchminvalue, searchminvalue + SIZEONEDIGIT)),
                    (line3.substring(searchminvalue, searchminvalue + SIZEONEDIGIT))));
        }
    }

    public String getPossibleDigitChar(int index, char data, String oldNumber, String number) {
        for (DigitValid digit : digits) {
            String posib = digit.getDigitChar();
            for (int indexfinal = 0; posib.length() > 0 && indexfinal < posib.length(); indexfinal++) {
                digitpossible.add(possible.setPos(index, posib.charAt(indexfinal), number));
                Set<String> midigits = new HashSet<String>(digitpossible);
                digitpossible.clear();
                digitpossible.addAll(midigits);
            }
        }
        return digitpossible.toString();
    }

}