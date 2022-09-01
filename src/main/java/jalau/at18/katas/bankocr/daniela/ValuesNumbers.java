package jalau.at18.katas.bankocr.daniela;

public enum ValuesNumbers {

    ZERO(new String[][]{{" ", "_", " " }, {"|", " ", "|" }, {"|", "_", "|" }}),
    ONE(new String[][]{{" ", " ", " " }, {" ", " ", "|" }, {" ", " ", "|" }}),
    TWO(new String[][]{{" ", "_", " " }, {" ", "_", "|" }, {"|", "_", " " }}),
    THREE(new String[][]{{" ", "_", " " }, {" ", "_", "|" }, {" ", "_", "|" }}),
    FOUR(new String[][]{{" ", " ", " " }, {"|", "_", "|" }, {" ", " ", "|" }}),
    FIVE(new String[][]{{" ", "_", " " }, {"|", "_", " " }, {" ", "_", "|" }}),
    SIX(new String[][]{{" ", "_", " " }, {"|", "_", " " }, {"|", "_", "|" }}),
    SEVEN(new String[][]{{" ", "_", " " }, {" ", " ", "|" }, {" ", " ", "|" }}),
    EIGHT(new String[][]{{" ", "_", " " }, {"|", "_", "|" }, {"|", "_", "|" }}),
    NINE(new String[][]{{" ", "_", " " }, {"|", "_", "|" }, {" ", "_", "|" }});

    private String[][] charactersNumbers;

    ValuesNumbers(String[][] charactersNumbers) {
        this.charactersNumbers = charactersNumbers;
    }

    public String[][] getCharactersNumbers() {
        return charactersNumbers;
    }
}
