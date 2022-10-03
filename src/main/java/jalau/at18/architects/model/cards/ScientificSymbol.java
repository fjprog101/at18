package jalau.at18.architects.model.cards;

public enum ScientificSymbol {
    COMPASS("compas.png", "Compass"),
    SCREW("rueda.png", "Screw"),
    OLDTABLE("table.png", "Oldtable");

    private String image;
    private String stringValue;

    ScientificSymbol(String image, String stringValue) {
        this.image = image;
        this.stringValue = stringValue;
    }

    public String getSymbol() {
        return stringValue;
    }

    public String getImage() {
        return image;
    }
}
