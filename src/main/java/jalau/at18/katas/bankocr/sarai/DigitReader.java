package jalau.at18.katas.bankocr.sarai;

import java.util.Arrays;

public class DigitReader {
    private final int sizethree = 3;
    private final int sizeArray = 27;
    private String[] matrixSize;
    private String[][] matrixSize27 = new String[sizeArray][1];
    private int naturalNumbers;

    int cont=0;
    private int[]  respp = new int[27];

    public DigitReader(String[] matrixSize) {
        this.matrixSize = matrixSize;
        recorrer();
        //compareCharacter();
    }


    public void recorrer() {
        NumbersCharacters[] arr = NumbersCharacters.values();
        for (NumbersCharacters col : arr) {
            if (Arrays.deepEquals(matrixSize, col.getcharacternumbers())) {
                naturalNumbers = col.ordinal();
            }
        }
    }
    public int getnaturalNumbers() {
        return naturalNumbers;
    }
}
