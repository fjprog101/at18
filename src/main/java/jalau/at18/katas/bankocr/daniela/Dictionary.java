package jalau.at18.katas.bankocr.daniela;

public class Dictionary {
    private static final String ZERO_CELL = " _ " + "| |" + "|_|";
    private String cellAsText;

    public Dictionary(String cellAsText) {
        this.cellAsText = cellAsText;
    }

    @Override
    public String toString() {
        return ZERO_CELL.equals(cellAsText) ? "0" : "1";
    }

}
