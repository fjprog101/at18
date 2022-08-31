package jalau.at18.katas.bankocr.alvaro;

import java.util.Arrays;

public class NumberOne {
    private static final int DIMENSION_MATRIX = 3;
    private char[][] matrix = new char[DIMENSION_MATRIX][DIMENSION_MATRIX];
    private char[][] NumberOne = {{' ', ' ', ' '}, {'|', ' ', ' '}, {'|', ' ', ' '}};
    public NumberOne(char[][] matrix) {
        this.matrix =  matrix;
        compareMatrix();

    }
    public boolean compareMatrix() {
        boolean cond =  false;
        if (Arrays.deepEquals(matrix, NumberOne)) {
            return !cond;
        }
        return cond;
    }
}
