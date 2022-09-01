package jalau.at18.katas.bankocr.daniela;

public enum ValuesNumbers {
    DIGIT_1(
            "   ",
            "  |",
            "  |",
            '1'),
    DIGIT_2(
            " _ ",
            " _|",
            "|_ ",
            '2'),
    DIGIT_3(
            " _ ",
            " _|",
            " _|",
            '3'),
    DIGIT_4(
            "   ",
            "|_|",
            "  |",
            '4'),
    DIGIT_5(
            " _ ",
            "|_ ",
            " _|",
            '5'),
    DIGIT_6(
            " _ ",
            "|_ ",
            "|_|",
            '6'),
    DIGIT_7(
            " _ ",
            "  |",
            "  |",
            '7'),
    DIGIT_8(
            " _ ",
            "|_|",
            "|_|",
            '8'),
    DIGIT_9(
            " _ ",
            "|_|",
            "  |",
            '9'),
    DIGIT_0(
            " _ ",
            "| |",
            "|_|",
            '0');

    private final String line1;
    private final String line2;
    private final String line3;
    private final char charValue;

    ValuesNumbers(String line1, String line2, String line3, char charValue) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.charValue = charValue;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getLine3() {
        return line3;
    }

    public char getCharValue() {
        return charValue;
    }

}
