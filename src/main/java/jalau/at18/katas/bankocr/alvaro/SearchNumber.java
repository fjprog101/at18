package jalau.at18.katas.bankocr.alvaro;
import java.util.Arrays;
public class SearchNumber {
    private static final int DIMENSION_MATRIX = 3;
    private static final char[][] NUMBER_ZERO = {{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
    private static final char[][] NUMBER_ONE = {{' ', ' ', ' '}, {'|', ' ', ' '}, {'|', ' ', ' '}};
    private static final char[][] NUMBER_TWO = {{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}};
    private static final char[][] NUMBER_THREE = {{' ', '_', ' '}, {' ', '_', '|'}, {' ', '_', '|'}};
    private static final char[][] NUMBER_FOUR = {{' ', ' ', ' '}, {'|', '_', '|'}, {' ', ' ', '|'}};
    private static final char[][] NUMBER_FIVE = {{' ', '_', ' '}, {'|', '_', ' '}, {' ', '_', '|'}};
    private static final char[][] NUMBER_SIX = {{' ', '_', ' '}, {'|', '_', ' '}, {'|', '_', '|'}};
    private static final char[][] NUMBER_SEVEN = {{' ', '_', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
    private static final char[][] NUMBER_EIGHT = {{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_', '|'}};
    private static final char[][] NUMBER_NINE = {{' ', '_', ' '}, {'|', '_', '|'}, {' ', '_', '|'}};
    private static final Number ZERO = new Number(NUMBER_ZERO, 0);
    private static final Number ONE = new Number(NUMBER_ONE, 1);
    private static final Number TWO = new Number(NUMBER_TWO, 2);
    private static final Number THREE = new Number(NUMBER_THREE, 3);
    private static final Number FOUR = new Number(NUMBER_FOUR, 4);
    private static final Number FIVE = new Number(NUMBER_FIVE, 5);
    private static final Number SIX = new Number(NUMBER_SIX, 6);
    private static final Number SEVEN = new Number(NUMBER_SEVEN, 7);
    private static final Number EIGHT = new Number(NUMBER_EIGHT, 8);
    private static final Number NINE = new Number(NUMBER_NINE, 9);
    private static final Number[] NUMBERS = {ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE};
    private char[][] number = new char[DIMENSION_MATRIX][DIMENSION_MATRIX];
    private int num;
    public SearchNumber(char[][] matrix) {
        this.number = matrix;
        search();
    }
    public int getNumber() {
        return num;
    }
    public void search() {
        for (int ind = 0; ind < NUMBERS.length; ind++) {
            if (Arrays.deepEquals(NUMBERS[ind].getData(), number)) {
                num = NUMBERS[ind].getNumber();
            }
        }
    }
}
