package jalau.at18.kingoftokyo.model;

public enum DiscardCards {
    ENERGIZE(8, 0, 0, 0, 9, "energize.PNG"),
    APARTMENT_BULIDING(5, 0, 0, 3, 0, "apartment_building.PNG"),
    COMMUTER_TRAIN(4, 0, 0, 2, 0, "commuter_train.PNG"),
    CORNER_STORE(3, 0, 0, 1, 0, "corner_store.PNG"),
    HIGH_ALTITUDE(5, 0, 0, 2, 0, "high_altitude.PNG"),
    FIRE_BLAST(3, 0, 2, 0, 0, "fire_blast.PNG"),
    GAS_REFINERY(6, 0, 3, 0, 0, "gas_refinery.PNG"),
    HEAL(3, 2, 0, 0, 0, "heal.PNG"),
    NUCLEAR_PLANT(6, 3, 0, 2, 0, "nuclear_plant.PNG"),
    SKYSCRAPER(6, 0, 0, 4, 0, "skyscraper.PNG"),
    AMUSEMENT_PARK(6, 0, 0, 4, 0, "amusement_park.PNG");

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
