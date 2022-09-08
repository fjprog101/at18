package jalau.at18.katas.bankocr.hugo;

public class Digits {
    private static final int LENGHT = 3;
    private static final int COLUMNS = 27;
    private char[][] digit = new char[LENGHT][LENGHT];
    private int digitColPos;

    public char[][] getDigit(char[][] entry, int colPos) {
        digitColPos = colPos;
        for (int row = 0; row < digit.length; row++) {
            columnsCycle(row, entry, colPos);
        }
        return digit;
    }

    public void columnsCycle(int row, char[][] entry, int colPos) {
        colPos = digitColPos;
        for (int col = 0; col < digit.length; col++) {
            digit[row][col] = entry[row][colPos];
            colPos++;
        }
    }
}
