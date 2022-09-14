package jalau.at18.architects;

public enum ScientificSymbol {
    COMPASS("Compass"),
    SCREW("Screw"),
    OLDTABLE("Oldtable");

    private String stringValue;

    ScientificSymbol(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getSymbol() {
        return stringValue;
    }
}
