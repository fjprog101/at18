package jalau.at18.katas.bankocr.robertof;

public class Table {
    private final int[][] table = {{1, 2, 3}, {6, 5, 4}, {7, 8, 9}};
    public int getValue(int x, int y) {
        return table[x][y];
    }
}
