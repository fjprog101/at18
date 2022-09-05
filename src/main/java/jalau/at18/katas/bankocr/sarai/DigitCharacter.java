package jalau.at18.katas.bankocr.sarai;

public class DigitCharacter {
private final int sizethree = 3;
private final int sizeArray = 27;
private String[] matrixSize = new String[sizethree];
private String[] matrixSize27 = new String[sizeArray];


    public DigitCharacter(String[] matrixSize) {
        this.matrixSize = matrixSize;
    }
    public void recorrerEntrada() {
        for (int index = 0; index < matrixSize27.length; index += 3) {
            String[] numberEntry = new String[sizethree];
            numberEntry[0] = matrixSize[0].substring(index, index+3);
            numberEntry[1] = matrixSize[1].substring(index, index+3);
            numberEntry[2] = matrixSize[2].substring(index, index+3);
        }
    }
}
