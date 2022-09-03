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
        NumChecker checker = new NumChecker();
        char[] accNum = new char[COLPOS];
        int[] intAccNum = new int[COLPOS];
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

        int count = 0;
        for (int index = 0; index < COLUMNS; index += DIGITCOL) {
            char[][] get = digit.getDigit(entry, index);
            accNum[count] = searchNum.getValue(get);
            count++;
        }
        System.out.println(accNum);

        for (int index = 0; index < COLPOS; index++) {
            intAccNum[index] = Character.getNumericValue(accNum[index]);
        }

        if (checker.checkAccountNum(intAccNum)) {
            System.out.println("ok");
        }
    }
}
