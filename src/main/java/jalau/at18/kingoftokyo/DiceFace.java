package jalau.at18.kingoftokyo;

public enum DiceFace {
    ONE("diceone.png", 1),
    TWO("dicetwo.png", 2),
    THREE("dicethree.png", 3),
    HEALING("dicefourhealing.png", 1),
    ENERGY("dicefiveenergy.png", 1),
    PUNCHING("dicesixpunching.png", 1);

    private String representativeValue;
    private int pointValue;

    DiceFace(String representativeValue, int pointValue) {
        this.representativeValue = representativeValue;
        this.pointValue = pointValue;
    }

    public String getRepresentativeValue() {
        return representativeValue;
    }

    public int getPointValue() {
        return pointValue;
    }
}
