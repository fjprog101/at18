package jalau.at18.katas.bankocr.sergio;

import java.io.FileNotFoundException;

public class SplitMatrix {

    private final int singleNumberSize = 3;
    private char[][] singleNumber;

    public SplitMatrix() throws FileNotFoundException {
        singleNumber = new char[singleNumberSize][singleNumberSize];
    }

    public char[][] singleNumber(char[][] matrix) {
        for (int row = 0; row < singleNumberSize; row++) {
            for (int colum = 0; colum < singleNumberSize; colum++) {
                singleNumber[row][colum] = matrix[row][colum];
            }
        }
        return singleNumber;
    }
}
