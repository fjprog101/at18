package jalau.at18.katas.bankocr.fernanda;

public enum Numbers {

    ONE(new char[][]{{' ', ' ', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}}, '1'),
    TWO(new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}}, '2'),
    THREE(new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {' ', '_', '|'}}, '3'),
    FOUR(new char[][]{{' ', ' ', ' '}, {'|', '_', '|'}, {' ', ' ', '|'}}, '4'),
    FIVE(new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {' ', '_', '|'}}, '5'),
    SIX(new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {'|', '_', '|'}}, '6'),
    SEVEN(new char[][]{{' ', '_', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}}, '7'),
    EIGHT(new char[][]{{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_', '|'}}, '8'),
    NINE(new char[][]{{' ', '_', ' '}, {'|', '_', '|'}, {' ', '_', '|'}}, '9'),
    ZERO(new char[][]{{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}}, '0');

    private final char[][] number;
    private final char numRep;

    Numbers(char[][] number, char numRep) {
        this.number = number;
        this.numRep = numRep;
    }

    public char[][] getNumber() {
        return number;
    }
    public char getNumRep() {
        return numRep;
    }
}
