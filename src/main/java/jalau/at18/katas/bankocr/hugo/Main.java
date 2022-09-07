package jalau.at18.katas.bankocr.hugo;

public class Main {
    private static final int COLUMNS = 27;
    private static final int ROWS = 4;
    private static final int DIGITROW = 3;
    private static final int DIGITCOL = 3;
    private static final int COLPOS = 9;

    public static void main(String[] args) {
        Digits digit = new Digits();
        Ocr searchNum = new Ocr();
        Ocr errors = new Ocr();
        Entry aEntry = new Entry();
        Result get = new Result();

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

        boolean illegible = errors.areErrors(accNum, COLPOS);
        get.getResult(intAccNum, accNum, illegible);
    }
}