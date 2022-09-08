package jalau.at18.katas.bankocr.alvaro;

public class Digit {
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    private static final int COLUMNS_DATA = 27;
    private static char[][] data = new char[ROWS][COLUMNS_DATA];
    private char[][] digit = new char[ROWS][COLUMNS];
    private ReadData readData;
    public Digit(String[] entryData) {
        String[] newData = entryData;
        readData =  new ReadData(newData);
        data = readData.getData();
    }
    public char[][] extractDigit(int indx) {
        int newindex = indx;
        for (int ind = 0; ind < ROWS; ind++) {
            moveData(newindex, ind);
            newindex = indx;
        }
        return digit;
    }
    public void moveData(int newindex, int ind) {
        for (int indj = 0; indj < ROWS; indj++) {
            digit[ind][indj] = data[ind][newindex];
            newindex++;
        }
    }
}
