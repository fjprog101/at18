package jalau.at18.katas.bankocr.hugo;

public class Main {
    private static final int COLUMNS = 27;
    private static final int ROWS = 4;
    private static final int DIGITCOL = 3;

    public static void main(String[] args) {
        char[][] cell = {
            {' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' '},
            {' ', ' ', '|', ' ', '_', '|', ' ', '_', '|', '|', '_', '|', '|', '_', ' ', '|', '_', ' ', ' ', ' ', '|', '|', '_', '|', '|', '_', '|'},
            {' ', ' ', '|', '|', '_', ' ', ' ', '_', '|', ' ', ' ', '|', ' ', '_', '|', '|', '_', '|', ' ', ' ', '|', '|', '_', '|', ' ', '_', '|'}};

        for (int index = 0; index < DIGITCOL; index++) {
            for (int jindex = 0; jindex < COLUMNS; jindex++) {
                System.out.print(cell[index][jindex]);
            }
            System.out.println();
        }
    }
}
