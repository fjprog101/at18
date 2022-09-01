package jalau.at18.katas.bankocr.fernanda;


public class Main {
    private static final int LENGTH = 24;
    private static final int INCREMENT = 3;
    public static void main(String[] args) {

        NextDigit tDigit = new NextDigit();
        Compare compare = new Compare();
            //11377968{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_', '|'}
        char[][] testNum = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' '},
                            {' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', ' ', ' ', '|', ' ', ' ', '|', '|', '_', '|', '|', '_', ' ', '|', '_', '|'},
                            {' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', ' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', '|', '_', '|', '|', '_', '|'}};

        for (int readNextdigit = 0; readNextdigit < LENGTH; readNextdigit += INCREMENT) {
            char[][] next = tDigit.getNextDigit(testNum, readNextdigit);
            compare.compareDig(next);
        }



    }



}
