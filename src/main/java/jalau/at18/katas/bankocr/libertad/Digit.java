package jalau.at18.katas.bankocr.libertad;
public enum Digit {
    NINE(new String[]{" _ ", "|_|", " _|"}, null),
    EIGTH(new String[]{" _ ", "|_|", "|_|"}, NINE),
    SEVEN(new String[]{" _ ", "  |", "  |"}, EIGTH),
    SIX(new String[]{" _ ", "|_ ", "|_|"}, SEVEN),
    FIVE(new String[]{" _ ", "|_ ", " _|"}, SIX),
    FOUR(new String[]{"   ", "|_|", "  |"}, FIVE),
    THREE(new String[]{" _ ", " _|", " _|"}, FOUR),
    TWO(new String[]{" _ ", " _|", "|_ "}, THREE),
    ONE(new String[]{"   ", "  |", "  |"}, TWO),
    ZERO(new String[]{" _ ", "| |", "|_|"}, ONE);
    private String[] representation;
    private Digit nextDigit;
    Digit(String[] representation, Digit nextDigit) {
        this.representation = representation;
        this.nextDigit = nextDigit;
    }
    public String[] getRepresentation() {
        return representation;
    }
    public boolean hasNext() {
        return nextDigit != null;
    }
    public Digit getNext() {
        return nextDigit;
    }
}
