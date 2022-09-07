package jalau.at18.katas.bankocr.adriana;

public enum DigitType {
    ZERO(new String[][]{{" ", "_", " "}, {"|", " ", "|"}, {"|", "_", "|"}}),
    ONE(new String[][]{{" ", " ", " "}, {" ", " ", "|"}, {" ", " ", "|"}}),
    TWO(new String[][]{{" ", "_", " "}, {" ", "_", "|"}, {"|", "_", " "}}),
    THREE(new String[][]{{" ", "_", " "}, {" ", "_", "|"}, {" ", "_", "|"}}),
    FOUR(new String[][]{{" ", " ", " "}, {"|", "_", "|"}, {" ", " ", "|"}}),
    FIVE(new String[][]{{" ", "_", " "}, {"|", "_", " "}, {" ", "_", "|"}}),
    SIX(new String[][]{{" ", "_", " "}, {"|", "_", " "}, {"|", "_", "|"}}),
    SEVEN(new String[][]{{" ", "_", " "}, {" ", " ", "|"}, {" ", " ", "|"}}),
    EIGHT(new String[][]{{" ", "_", " "}, {"|", "_", "|"}, {"|", "_", "|"}}),
    NINE(new String[][]{{" ", "_", " "}, {"|", "_", "|"}, {" ", "_", "|"}});
    private String[][] arrayCharacters;
    DigitType(String[][] arrayCharacters) {
        this.arrayCharacters = arrayCharacters;
    }
    public String[][] getArrayCharacters() {
        return arrayCharacters;
    }
}
