package jalau.at18.katas.bankocr.rodrigob;

public class Scanner {
    private static final int MAX_DIGITS_ACOUNT = 9;
    private SplitInput splitInput = new SplitInput();
    private CompareDigits compareDigits = new CompareDigits();
    public Scanner() {

    }

    public char[][] readInput() {
        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "  | _| _||_||_ |_   ||_||_|";
        String line3 = "  ||_  _|  | _||_|  ||_| _|";
        ConvertInput convertInput = new ConvertInput(line1, line2, line3);
        return convertInput.convertAllTheLines(line1, line2, line3);
    }
    public String writeOutput(char[][] inputConverted) {
        char[][] out;
        String writed = "";
        for (int digit = 0; digit < MAX_DIGITS_ACOUNT; digit++) {
            out = splitInput.splitOneDigit(inputConverted);
            writed += compareDigits.getDigitString(out);
        }
        return writed;
    }
}
