package jalau.at18.katas.bankocr.fernanda;

public class ConvertNumber {
    private static final int LENGTH = 27;
    private static final int INCREMENT = 3;
    private static String digitString = "";

    private NextDigit tDigit = new NextDigit();
    private Compare compare = new Compare();

    public int convertedNumber(char[][] numberToConvert) {
        for (int readNextdigit = 0; readNextdigit < LENGTH; readNextdigit += INCREMENT) {
            char[][] next = tDigit.getNextDigit(numberToConvert, readNextdigit);
            digitString = digitString + compare.compareDig(next);
        }
        return Integer.parseInt(digitString);
    }
}
