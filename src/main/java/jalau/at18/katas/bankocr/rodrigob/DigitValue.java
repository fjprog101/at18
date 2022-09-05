package jalau.at18.katas.bankocr.rodrigob;

public enum DigitValue {

    ONE(new char[][]{{' ', ' ', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}}, "1"),
    TWO(new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}}, "2"),
    THREE(new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {' ', '_', '|'}}, "3"),
    FOUR(new char[][]{{' ', ' ', ' '}, {'|', '_', '|'}, {' ', ' ', '|'}}, "4"),
    FIVE(new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {' ', '_', '|'}}, "5"),
    SIX(new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {'|', '_', '|'}}, "6"),
    SEVEN(new char[][]{{' ', '_', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}}, "7"),
    EIGHT(new char[][]{{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_', '|'}}, "8"),
    NINE(new char[][]{{' ', '_', ' '}, {'|', '_', '|'}, {' ', '_', '|'}}, "9"),
    ZERO(new char[][]{{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}}, "0");

    private char[][] value;
    private String digit;

    DigitValue(char[][] numberValue, String digitNumber) {
        this.value = numberValue;
        this.digit = digitNumber;
    }

    public char[][] getValue() {
        return value;
    }

    public String getDigit() {
        return digit;
    }
}
