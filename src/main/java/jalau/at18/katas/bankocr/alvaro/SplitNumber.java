package jalau.at18.katas.bankocr.alvaro;
public class SplitNumber {

    private static final int DIMENSIONS = 3;
    private static final int LONGITUD_NUMBER = 9;
    private static final int JUMP_TO_NEXT_NUMBER = 3;
    private static final int COLUMNS = 27;
    private static final int ROWS = 3;
    private static char[][] mat = new char[ROWS][COLUMNS]; //3x27
    Digit digit;
    private int index = 0;
    private char[][] mat3x3 = new char[DIMENSIONS][DIMENSIONS];
    private String[] data;
    ConvertToMatrix split;
    public SplitNumber(String[] Data) {
        this.data = Data;
        split =  new ConvertToMatrix(data);
        mat = split.getMatrix();
        mainOperator();
    }
    public void mainOperator() {
        for (int ind = 0; ind < LONGITUD_NUMBER; ind++) {
            mat3x3 =extractNumberIn3x3Matrix(index);
            index = index + JUMP_TO_NEXT_NUMBER;
            digit = new Digit(mat3x3);
        }
    }
    public char[][] extractNumberIn3x3Matrix(int index) {
        int newindex = index;
        char[][] mat3x3 = new char[ROWS][ROWS];
        for (int ind = 0; ind < ROWS; ind++) {
            for (int indj = 0; indj < ROWS; indj++) {
                mat3x3[ind][indj] = mat[ind][newindex];
                newindex++;
            }
            newindex = index;
        }
        return mat3x3;
    }
}
