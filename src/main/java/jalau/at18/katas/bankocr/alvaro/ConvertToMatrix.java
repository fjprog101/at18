package jalau.at18.katas.bankocr.alvaro;

public class ConvertToMatrix {
    private String entry;
    private String[] data;
    private static final int NROENTRYS = 3;
    private static char[][] mat = new char[3][27]; //3x27
    public ConvertToMatrix(String[] Data) {
        this.data = Data;
        entryData();
        //printMatrix(mat);
    }
    public void entryData() {
        for (int ind = 0; ind < NROENTRYS; ind++) {
            entry = data[ind];
            addToMatrix(entry, ind);
        }
    }
    public void addToMatrix(String string, int index) {
        char[] line = string.toCharArray();
        for (int ind = 0; ind < 27; ind++) {
            mat[index][ind] = line[ind];
        }
    }
    public char[][] getMatrix() {
        return mat;
    }
    public void printMatrix(char[][] mat) {
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 27; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
