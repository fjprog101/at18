package jalau.at18.katas.bankocr.rodrigob;


public class ConvertInput {
    private static final int SIZE = 27;
    private static final int ROW = 3;
    private char[][] inputConverted = new char[ROW][SIZE];

    public ConvertInput(String line1, String line2, String line3) {

    }

    public void convertFirstLine(String line1) {
        for (int column = 0; column < SIZE; column++) {
            this.inputConverted[0][column] = line1.charAt(column);
        }
    }
    public void convertSecondtLine(String line2) {
        for (int column = 0; column < SIZE; column++) {
            this.inputConverted[1][column] = line2.charAt(column);
        }
    }
    public void convertThirdLine(String line3) {
        for (int column = 0; column < SIZE; column++) {
            this.inputConverted[2][column] = line3.charAt(column);
        }
    }
    public char[][] getInputConverted() {
        return this.inputConverted;
    }

}
