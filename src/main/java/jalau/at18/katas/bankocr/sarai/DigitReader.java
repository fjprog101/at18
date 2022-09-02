package jalau.at18.katas.bankocr.sarai;

import java.util.Arrays;

public class DigitReader {
    private final int sizethree = 3;
    private final int sizeArray = 27;
    private String[][] matrixSize = new String[sizethree][sizethree];
    private String[][] matrixSize27 = new String[sizeArray][1];
    private int naturalNumbers;
    /*  private String espace = " ";
    private String underline = "_";
    private String pleca = "|"; */

    public DigitReader(String[][] matrixSize) {
        this.matrixSize = matrixSize;
        recorrer();
        compareCharacter();
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

    public void compareCharacter() {
        EachCharacter[] prim = EachCharacter.values();
        if (matrixSize27.length == sizeArray) {
            for (int index = 0; index <= matrixSize27.length; index++) {
                if (index == 2) {
                    index = sizeArray;
                    for (EachCharacter coll : prim) {
                        if (Arrays.deepEquals(matrixSize, coll.getEachCharacter())) {
                            naturalNumbers = coll.ordinal();
                        }
                    }
                }
            }
        }
    }
    public int getcompareCharacter() {
        return naturalNumbers;
    }
}
