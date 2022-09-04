package jalau.at18.katas.bankocr.hugo;

import java.util.Arrays;

public class Main {
    private static final int COLUMNS = 27;
    private static final int ROWS = 4;
    private static final int DIGITROW = 3;
    private static final int DIGITCOL = 3;
    private static final int COLPOS = 9;

    public static void main(String[] args) {
        Digits digit = new Digits();
        Ocr searchNum = new Ocr();
        NumChecker checker = new NumChecker();
        Entry aEntry = new Entry();
        Iterator iter = new Iterator();

        char[] accNum = new char[COLPOS];
        int[] intAccNum = new int[COLPOS];

        char[][] entry = aEntry.getEntry();

        int ind = 0;
        for (int pos = 0; pos < COLUMNS; pos += DIGITCOL) {
            char[][] aDigit = digit.getDigit(entry, pos);
            accNum[ind] = searchNum.getValue(aDigit);
            ind++;
        }

        for (int index = 0; index < COLPOS; index++) {
            intAccNum[index] = Character.getNumericValue(accNum[index]);
        }

        if (checker.checkAccountNum(intAccNum)) {
            System.out.println(String.copyValueOf(accNum) + " ok");
        } else {
            System.out.println(String.copyValueOf(accNum) + " ERR");
            System.out.println(Arrays.toString(iter.iterate(intAccNum)));
        }
    }
}