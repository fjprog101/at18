package jalau.at18.katas.bankocr.sarai;

public class Position {
    private static final int SIZETHREE = 3;
    private String[] matrixSize = new String[SIZETHREE];

    public String[] getposition(int index) {
        String[] numberEntry = new String[SIZETHREE];
        numberEntry[0] = matrixSize[0].substring(index, index + SIZETHREE);
        numberEntry[1] = matrixSize[1].substring(index, index + SIZETHREE);
        numberEntry[2] = matrixSize[2].substring(index, index + SIZETHREE);
        return numberEntry;
    }
    public Position(String[] matrixSize) {
        this.matrixSize = matrixSize;
    }
}
