package jalau.at18.katas.bankocr.adriana;

public class Input {
    private static final int DIGIT_LEGTH = 3;
    private String[][] input;
    private Digit[] digits;
    private int totalDigits;

    public Input(String[][] input) {
        this.input = input;
        totalDigits = input[0].length / DIGIT_LEGTH;
        digits = new Digit[totalDigits];
        generateDigits();
    }

    public Digit[] getDigits() {
        return digits;
    }
    public void generateDigits() {
        for (int index = 0; index < totalDigits; index++) {
            digits[index] = new Digit(generateString(index));
        }
    }
    public String[][] generateString(int index) {
        String[][] digitImage = new String[DIGIT_LEGTH][DIGIT_LEGTH];
        for (int row = 0; row < DIGIT_LEGTH; row++) {
            for (int column = 0; column < DIGIT_LEGTH; column++) {
                digitImage[row][column] = input[row][column + DIGIT_LEGTH * index];
            }
        }
        return digitImage;
    }
}
