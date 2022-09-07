package jalau.at18.katas.bankocr.rodrigob;


public class ConvertInput {
    private static final int SIZE = 27;
    private static final int ROW = 3;
    private char[][] inputConverted = new char[ROW][SIZE];

    public ConvertInput(String line1, String line2, String line3) {
    }

    public char[][] getInputConverted(String line1, String line2, String line3) {
        convertThreeLines(line1, line2, line3);
        return this.inputConverted;
    }

    public void convertThreeLines(String line1, String line2, String line3) {
        for (int column = 0; column < SIZE; column++) {
            this.inputConverted[0][column] = line1.charAt(column);
            this.inputConverted[1][column] = line2.charAt(column);
            this.inputConverted[2][column] = line3.charAt(column);
        }
    }
}
