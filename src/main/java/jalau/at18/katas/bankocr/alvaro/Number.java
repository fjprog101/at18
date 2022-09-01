package jalau.at18.katas.bankocr.alvaro;
import java.util.Arrays;
public class Number {
    private static final int DIMENSION_MATRIX = 3;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGTH = 8;
    private static final int NINE = 9;
    private static final int ZERO = 0;
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
    private char[][] number = new char[DIMENSION_MATRIX][DIMENSION_MATRIX];
    private int num;
    public Number(char[][] matrix) {
        this.number = matrix;
    }
    public void compareNumber() {
        if (Arrays.deepEquals(number, NUMBER_ONE)) {
            num = ONE;
        } else if (Arrays.deepEquals(number, NUMBER_TWO)) {
            num = TWO;
        } else if (Arrays.deepEquals(number, NUMBER_THREE)) {
            num = THREE;
        } else if (Arrays.deepEquals(number, NUMBER_FOUR)) {
            num = FOUR;
        } else if (Arrays.deepEquals(number, NUMBER_FIVE)) {
            num = FIVE;
        } else if (Arrays.deepEquals(number, NUMBER_SIX)) {
            num = SIX;
        } else if (Arrays.deepEquals(number, NUMBER_SEVEN)) {
            num = SEVEN;
        } else if (Arrays.deepEquals(number, NUMBER_EIGHT)) {
            num = EIGTH;
        } else if (Arrays.deepEquals(number, NUMBER_NINE)) {
            num = NINE;
        } else if (Arrays.deepEquals(number, NUMBER_ZERO)) {
            num = ZERO;
        }
    }
    public int getNumber() {
        return num;
    }
}
