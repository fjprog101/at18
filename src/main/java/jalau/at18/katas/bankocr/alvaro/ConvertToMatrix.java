package jalau.at18.katas.bankocr.alvaro;
public class ConvertToMatrix {
    private String entry;
    private String[] data;
    private static final int NROENTRYS = 3;
    private static final int ROWS = 3;
    private static final int LONGITUD_NUMBER = 27;
    private static char[][] mat = new char[ROWS][LONGITUD_NUMBER]; //3x27
    public ConvertToMatrix(String[] data) {
        this.data = data;
        entryData();
    }
    public void entryData() {
        for (int ind = 0; ind < NROENTRYS; ind++) {
            entry = data[ind];
            addToMatrix(entry, ind);
        }
    }
    public void addToMatrix(String string, int index) {
        char[] line = string.toCharArray();
        for (int ind = 0; ind < LONGITUD_NUMBER; ind++) {
            mat[index][ind] = line[ind];
        }
    }
    public char[][] getMatrix() {
        return mat;
    }
}
