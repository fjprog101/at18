package jalau.at18.katas.bankocr.alvaro;
import java.util.Arrays;
public class Number {
    private static final int DIMENSION_MATRIX = 3;
    private static final int ONE = 1;
    private static final char[][] NUMBER_ZERO = {{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
    private static final char[][] NUMBER_ONE = {{' ', ' ', ' '}, {'|', ' ', ' '}, {'|', ' ', ' '}};
    private static final char[][] NUMBER_TWO = {{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}};
    private static final char[][] NUMBER_THREE = {{' ', '_', ' '}, {' ', '_', '|'}, {' ', '_', '|'}};
    private static final char[][] NUMBER_FOUR= {{' ', ' ', ' '}, {'|', '_', '|'}, {' ', ' ', '|'}};
    private static final char[][] NUMBER_FIVE = {{' ', '_', ' '}, {'|', '_', ' '}, {' ', '_', '|'}};
    private static final char[][] NUMBER_SIX = {{' ', '_', ' '}, {'|', '_', ' '}, {'|', '_', '|'}};
    private static final char[][] NUMBER_SEVEN = {{' ', '_', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
    private static final char[][] NUMBER_EIGHT = {{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_', '|'}};
    private static final char[][] NUMBER_NINE = {{' ', '_', ' '}, {'|', '_', '|'}, {' ', '_', '|'}};
    private char[][] number = new char[DIMENSION_MATRIX][DIMENSION_MATRIX];
    int num;
    public Number(char[][] matrix) {
        this.number = matrix;
    }
    public void compareNumber() {
        if (Arrays.deepEquals(number, NUMBER_ONE)) {
            num = ONE;
        } else if (Arrays.deepEquals(number, NUMBER_TWO)){
            num = 2;
        } else if (Arrays.deepEquals(number, NUMBER_THREE)){
            num = 3;
        } else if (Arrays.deepEquals(number, NUMBER_FOUR)){
            num = 4;
        } else if (Arrays.deepEquals(number, NUMBER_FIVE)){
            num = 5;
        } else if (Arrays.deepEquals(number, NUMBER_SIX)){
            num = 6;
        } else if (Arrays.deepEquals(number, NUMBER_SEVEN)){
            num = 7;
        } else if (Arrays.deepEquals(number, NUMBER_EIGHT)){
            num = 8;
        } else if (Arrays.deepEquals(number, NUMBER_NINE)){
            num = 9;
        } else if (Arrays.deepEquals(number, NUMBER_ZERO)){
            num = 0;
        }
    }
    public int getNumber() {
        return num;
    }
}
