package jalau.at18.katas.bankocr.daniela;

public class Digit {
    private final String line1;
    private final String line2;
    private final String line3;

    public Digit(String line1, String line2, String line3) {
        CheckLenght(line1);
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    private void CheckLenght(String line) {
        if (line.length() != 3) {
            throw new UnsupportedOperationException("The all numbers are invalid");
        }
    }

    public boolean isValid() {
        throw new UnsupportedOperationException();
    }

}
