package jalau.at18.katas.bankocr.hugo;

public enum Numbers {
    NUM1(new char[][] {
            {' ', ' ', ' '},
            {' ', ' ', '|'},
            {' ', ' ', '|'}}, '1'),
    NUM2(new char[][] {
            {' ', '_', ' '},
            {' ', '_', '|'},
            {'|', '_', ' '}}, '2'),
    NUM3(new char[][] {
            {' ', '_', ' '},
            {' ', '_', '|'},
            {' ', '_', '|'}}, '3'),
    NUM4(new char[][] {
            {' ', ' ', ' '},
            {'|', '_', '|'},
            {' ', ' ', '|'}}, '4'),
    NUM5(new char[][] {
            {' ', '_', ' '},
            {'|', '_', ' '},
            {' ', '_', '|'}}, '5'),
    MUN6(new char[][] {
            {' ', '_', ' '},
            {'|', '_', ' '},
            {'|', '_', '|'}}, '6'),
    NUM7(new char[][] {
            {' ', '_', ' '},
            {' ', ' ', '|'},
            {' ', ' ', '|'}}, '7'),
    NUM8(new char[][] {
            {' ', '_', ' '},
            {'|', '_', '|'},
            {'|', '_', '|'}}, '8'),
    NUM9(new char[][] {
            {' ', '_', ' '},
            {'|', '_', '|'},
            {' ', '_', '|'}}, '9'),
    NUM0(new char[][] {
            {' ', '_', ' '},
            {'|', ' ', '|'},
            {'|', '_', '|'}}, '0');

    private final char[][] digit;
    private final char numberValue;

    Numbers(char[][] digit, char numberValue) {
        this.digit = digit;
        this.numberValue = numberValue;
    }

    public char[][] getdigit() {
        return digit;
    }

    public char getValue() {
        return numberValue;
    }
}
