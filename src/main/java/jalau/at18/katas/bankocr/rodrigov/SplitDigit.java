package jalau.at18.katas.bankocr.rodrigov;

import java.io.FileNotFoundException;

public class SplitDigit {
    private String[] lines;
    private int firstCont = 0;
    private int limitCont = 0;
    private final int mod3 = 3;
    private int cont = 0;
    private String number;
    private final int digitsLimit = 9;
    private String[] digits = new String[digitsLimit];
    private ReadFile readFile = new ReadFile();

    public SplitDigit() throws FileNotFoundException {
        readFile.readAccountsTxt();
        this.lines = readFile.getLines();
        limitCont = mod3;
    }

    public void splitNumbers() {
        for (int index = 0; index <= lines[0].length(); index++) {
            splitNumbersMod3(index);
        }
    }

    public void splitNumbersMod3(int index) {
        if (index % mod3 == 0 && index != 0) {
            number = lines[0].substring(firstCont, limitCont);
            number += lines[1].substring(firstCont, limitCont);
            number += lines[2].substring(firstCont, limitCont);
            incrementAndClear();
        }
    }

    public void incrementAndClear() {
        digits[cont] = number;
        cont++;
        firstCont += mod3;
        limitCont += mod3;
        number = "";
    }

    public String[] getDigits() {
        return digits;
    }

    public void setDigits(String[] dig) {
        this.digits = dig;
    }
}
