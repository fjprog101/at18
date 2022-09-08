package jalau.at18.katas.bankocr.sarai;

import java.util.Arrays;

public class DigitReader {
    private String[] matrixSize;
    private int naturalNumbers;

    public DigitReader(String[] matrixSize) {
        this.matrixSize = matrixSize;
        traverse();
    }
    public void traverse() {
        EachCharacter[] arr = EachCharacter.values();
        for (EachCharacter col : arr) {
            if (Arrays.deepEquals(matrixSize, col.getEachCharacter())) {
                naturalNumbers = col.ordinal();
            }
        }
    }
    public int getnaturalNumbers() {
        return naturalNumbers;
    }
}
