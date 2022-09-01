package jalau.at18.katas.bankocr.libertad;

public class Digit {
    private int value;
    private String[][] representation;
    public Digit(int value, String[][] representation) {
        this.value = value;
        this.representation = representation;
    }
    public int getValue() {
        return value;
    }
    public String[][] getRepresentation() {
        return representation;
    }
}
