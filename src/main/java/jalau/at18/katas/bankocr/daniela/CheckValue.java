package jalau.at18.katas.bankocr.daniela;

public class CheckValue {
    private static final int ZISE = 3;
    private static final int SIZE_NUMBERS = 27;
    private final String line1;
    private final String line2;
    private final String line3;

    public CheckValue(String line1, String line2, String line3) {
        checkThatLinehas27(line1);
        checkThatLinehas27(line2);
        checkThatLinehas27(line3);
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    public boolean checkThatLinehas27(String line) {
        if (line.length() != SIZE_NUMBERS) {
            return false;
        }
        return true;

    }
}
