package jalau.at18.katas.bankocr.rodrigob;

public class Printer {
    private static final int MAX_DIGITS_ACOUNT = 9;
    private static final int ROW = 3;
    private static final int COLUMN = 27;
    private SplitInput splitInput = new SplitInput();
    private CompareDigits compareDigits = new CompareDigits();

    public Printer() {
    }

    public String writeOutput(char[][] inputConverted) {
        char[][] out = new char[ROW][COLUMN];
        String accountNumbers = "";
        return parserDigit(out, accountNumbers, inputConverted);
    }

    public String parserDigit(char[][] out, String accountNumbers, char[][] inputConverted) {
        for (int digit = 0; digit < MAX_DIGITS_ACOUNT; digit++) {
            out = splitInput.splitOneDigit(inputConverted);
            accountNumbers += compareDigits.getDigitString(out);
        }
        return accountNumbers;
    }
}
