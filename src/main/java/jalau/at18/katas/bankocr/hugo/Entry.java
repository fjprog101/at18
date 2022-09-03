package jalau.at18.katas.bankocr.hugo;

public class Entry {
    private static final int COLUMNS = 27;
    private static final int DIGITROW = 3;
    private char[][] entry = new char[DIGITROW][COLUMNS];
    private String[] allrow = new String[DIGITROW];
    private String firrow = "    _  _  _  _  _  _     _ ";
    private String secrow = "|_||_|| || ||_   |  |  ||_ ";
    private String tirrow = "  | _||_||_||_|  |  |  | _|";

    /*private String firrow = "    _  _     _  _  _  _  _ ";
    private String secrow = "  | _| _||_||_ |_   ||_||_|";
    private String tirrow = "  ||_  _|  | _||_|  ||_| _|";*/

    private void setAllRows() {
        allrow[0] = firrow;
        allrow[1] = secrow;
        allrow[2] = tirrow;
    }

    public void setEntry() {
        for (int row = 0; row < DIGITROW; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                entry[row][col] = allrow[row].charAt(col);
            }
        }
    }

    public char[][] getEntry() {
        setAllRows();
        setEntry();
        return entry;
    }
}
