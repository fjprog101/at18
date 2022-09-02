package jalau.at18.katas.bankocr.rodrigob;


public class SplitInput {
    private static final int LINES = 3;
    private char[][] digit = new char[LINES][LINES];
    private int countPosition = 0;

    public SplitInput() {
    }

    public char[][] splitOneDigit(char[][] input) {
        for (int column = 0; column < LINES; column++) {
            rowIterations(input, column);
        }
        return getCharDigit();
    }

    public void rowIterations(char[][] input, int column) {
        for (int row = 0; row < LINES; row++) {
            this.digit[row][column] = input[row][getCountPosition()];
        }
        this.countPosition++;
    }

    public char[][] getCharDigit() {
        return digit;
    }

    public int getCountPosition() {
        return countPosition;
    }
}
