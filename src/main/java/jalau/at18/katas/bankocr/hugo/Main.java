package jalau.at18.katas.bankocr.hugo;

public class Main {
    private static final int COLUMNS = 27;
    private static final int ROWS = 4;
    private static final int DIGITROW = 3;
    private static final int DIGITCOL = 3;
    private static final int COLPOS = 9;

    public static void main(String[] args) {
        Digits digit = new Digits();
        Ocr searchNum = new Ocr();

        char[][] entry = {
            {' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' '},
            {' ', ' ', '|', ' ', '_', '|', ' ', '_', '|', '|', '_', '|', '|', '_', ' ', '|', '_', ' ', ' ', ' ', '|', '|', '_', '|', '|', '_', '|'},
            {' ', ' ', '|', '|', '_', ' ', ' ', '_', '|', ' ', ' ', '|', ' ', '_', '|', '|', '_', '|', ' ', ' ', '|', '|', '_', '|', ' ', '_', '|'}};

        for (int row = 0; row < DIGITROW; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                System.out.print(entry[row][col]);
            }
            System.out.println();
        }

        char[][] get = digit.getDigit(entry, COLPOS);
        for (int row = 0; row < DIGITROW; row++) {
            for (int col = 0; col < DIGITCOL; col++) {
                System.out.print(get[row][col]);
            }
            System.out.println();
        }
        System.out.println(searchNum.getValue(get));
    }
}
