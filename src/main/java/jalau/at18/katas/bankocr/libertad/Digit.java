package jalau.at18.katas.bankocr.libertad;
public enum Digit {
    NINE(9, new String[]{" _ ", "|_|", " _|"}, null),
    EIGTH(8, new String[]{" _ ", "|_|", "|_|"}, NINE),
    SEVEN(7, new String[]{" _ ", "  |", "  |"}, EIGTH),
    SIX(6, new String[]{" _ ", "|_ ", "|_|"}, SEVEN),
    FIVE(5, new String[]{" _ ", "|_ ", " _|"}, SIX),
    FOUR(4, new String[]{"   ", "|_|", "  |"}, FIVE),
    THREE(3, new String[]{" _ ", " _|", " _|"}, FOUR),
    TWO(2, new String[]{" _ ", " _|", "|_ "}, THREE),
    ONE(1, new String[]{"   ", "  |", "  |"}, TWO),
    ZERO(0, new String[]{" _ ", "| |", "|_|"}, ONE);
    private int value;
    private String[] representation;
    private Digit nexDigit;
    Digit(int value, String[] representation, Digit nextDigit) {
        this.value = value;
        this.representation = representation;
        this.nexDigit = nextDigit;
    }
    public int getValue() {
        return value;
    }
    public String[] getRepresentation() {
        return representation;
    }
    public boolean hasNext() {
        return nexDigit != null;
    }
    public Digit getNextDigit() {
        return nexDigit;
    }
}
