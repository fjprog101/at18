package jalau.at18.katas.bankocr.fernanda;

public class NextDigit {
    private static final int SIZE = 3;
    private char[][] nextDigit = new char[SIZE][SIZE];
    private int saveDigitPos;

    public char[][] getNextDigit(char[][] first, int readNextDig) {
        saveDigitPos = readNextDig;
        for (int row = 0; row < nextDigit.length; row++) {
            readNextDig = saveDigitPos;
            nextColumn(row, readNextDig, first);
        }
        return nextDigit;
    }

    public void nextColumn(int row, int readNextDig, char[][] first) {
        for (int column = 0; column < nextDigit.length; column++) {
            nextDigit[row][column] = first[row][readNextDig];
            readNextDig += 1;
        }
    }
}
