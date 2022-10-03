package jalau.at18.architects.model.cards;

public enum MilitarySymbol {
    PERMANENT("escn.png", 0),
    ONE_HORN("esch.png", 1),
    TWO_HORN("esc.png", 2);

    private String image;
    private int horns;
    MilitarySymbol(String image, int horns) {
        this.image = image;
        this.horns = horns;
    }

    public int getHorns() {
        return horns;
    }

    public String getImage() {
        return image;
    }
}