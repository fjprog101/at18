package jalau.at18.kingoftokyo;

public enum DiscardCards {
    ENERGIZE(8, 0, 0, 0, 9, "energize.PNG"),
    APARTMENT_BULIDING(5, 0, 0, 3, 0, "energize.PNG"),
    COMMUTER_TRAIN(4, 0, 0, 2, 0, "energize.PNG"),
    CORNER_STORE(3, 0, 0, 1, 0, "energize.PNG"),
    HIGH_ALTITUDE(5, 0, 0, 2, 0, "energize.PNG"),
    FIRE_BLAST(3, 0, 2, 0, 0, "energize.PNG"),
    GAS_REFINERY(6, 0, 3, 0, 0, "energize.PNG"),
    HEAL(3, 2, 0, 0, 0, "energize.PNG"),
    NUCLEAR_POWER_PLANT(6, 3, 0, 2, 0, "energize.PNG"),
    SKYSCREAPER(6, 0, 0, 4, 0, "energize.PNG"),
    AMUSEMENT_PARK(6, 0, 0, 4, 0, "energize.PNG");

    private int healing;
    private int damage;
    private int score;
    private int energy;
    private int cost;
    private String imagePath;

    DiscardCards(int cost, int healing, int damage, int score, int energy, String imagePath) {
        this.healing = healing;
        this.damage = damage;
        this.score = score;
        this.energy = energy;
        this.cost = cost;
        this.imagePath = imagePath;
    }
    public int[] getEffect() {
        int[] effects = {healing, damage, score, energy};
        return effects;
    }
    public int getCost() {
        return cost;
    }
    public String getImagePath() {
        return imagePath;
    }
}
