package jalau.at18.katas.bankocr.sarai;

import java.util.Arrays;

public class DigitReader {
    private final int sizethree = 3;
    private final int sizeArray = 27;
    private String[] matrixSize;
    private String[][] matrixSize27 = new String[sizeArray][1];
    private int naturalNumbers;

    public DigitReader(String[] matrixSize) {
        this.matrixSize = matrixSize;
        recorrer();
        //compareCharacter();
    }
    public void recorrer() {
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

/* 
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
    }*/
/*
    public void recorrerEntrada() {
        if (matrixSize27.length == sizeArray) {
            for (int index = 0; index <= matrixSize27.length; index++) {
                charactertoNumberZero(index);
            }
        }
    }
    public void compareCharacter(){ //va a recorrer each charater
        EachCharacter[] prim = EachCharacter.values();
        for (EachCharacter coll : prim) {
            if (Arrays.deepEquals(matrixSize, coll.getEachCharacter())) {
                naturalNumbers = coll.ordinal();
            }
        }
    }
    public void charactertoNumberZero(int index){
        if (index == 2) {
            index = sizeArray;
            compareCharacter();
        }
    }
    public void charactertoNumberOne(int index){
        if (index == 2) {
            index = sizeArray;
            compareCharacter();
        }
    }

    public int getcompareCharacter() {
        return naturalNumbers;
    }
    
    */
}
