package jalau.at18.kingoftokyo;

public enum DiceFace {
    ONE(1, 1),
    TWO(2, 2),
    THREE(3, 3),
    HEALING(4, 1),
    ENERGY(5, 1),
    PUNCHING(6, 1);

    private int representativeValue;
    private int pointValue;

    DiceFace(int representativeValue, int pointValue) {
        this.representativeValue = representativeValue;
        this.pointValue = pointValue;
    }

    public int getRepresentativeValue() {
        return representativeValue;
    }

    public int getPointValue() {
        return pointValue;
    }
}
