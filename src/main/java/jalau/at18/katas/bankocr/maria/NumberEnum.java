package jalau.at18.katas.bankocr.maria;

public enum NumberEnum {
    EMPTY("   "),
    ONLYUNDERSCORE(" _ "),
    TWOPIPESSPACE("| |"),
    PIPESUNDERSCORE("|_|"),
    ONLYPIPESRIGHT("  |"),
    RIGHTPIPESUNDERSCORE(" _|"),
    LEFTPIPESUNDERSCORE("|_ ");

    private final String label;

    NumberEnum(String label) {
        this.label = label;
    }
}
