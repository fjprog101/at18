package jalau.at18.katas.bankocr.alvaro;
public class ReadData {
    private static final int NROENTRYS = 3;
    private static final int ROWS = 3;
    private static final int LONGITUD_NUMBER = 27;
    private String entry;
    private String[] entryData;
    private static char[][] data = new char[ROWS][LONGITUD_NUMBER]; //3x27
    public ReadData(String[] entryData) {
        this.entryData = entryData;
        entry();
    }
    public void entry() {
        for (int ind = 0; ind < NROENTRYS; ind++) {
            entry = entryData[ind];
            addToMatrix(entry, ind);
        }
    }
    public void addToMatrix(String string, int index) {
        char[] line = string.toCharArray();
        for (int ind = 0; ind < LONGITUD_NUMBER; ind++) {
            data[index][ind] = line[ind];
        }
    }
    public char[][] getData() {
        return data;
    }
}
