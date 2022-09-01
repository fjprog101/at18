package jalau.at18.katas.bankocr.maria;

public enum NumberEnum {
    ZERO(" _ ", "| |", "|_|"),
    ONE("   ", "  |", "  |"),
    TWO(" _ ", " _|", "|_ ");

    private final String firstColumn;
    private final String secondColumn;
    private final String thirdColumn;

    NumberEnum(String firstColumn, String secondColumn, String thirdColumn) {
        this.firstColumn = firstColumn;
        this.secondColumn = secondColumn;
        this.thirdColumn = thirdColumn;
    }

    public String getFirstColumn() {
        return firstColumn;
    }

    public String getSecondColumn() {
        return secondColumn;
    }

    public String getThirdColumn() {
        return thirdColumn;
    }
}
