package jalau.at18.kingoftokyo;

public enum DiscardCards {
    ENERGIZE(8, 0, 0, 0, 9),
    APARTMENT_BULIDING(5, 0, 0, 3, 0),
    COMMUTER_TRAIN(4, 0, 0, 2, 0),
    CORNER_STORE(3, 0, 0, 1, 0),
    HIGH_ALTITUDE(5, 0, 0, 2, 0),
    FIRE_BLAST(3, 0, 2, 0, 0),
    GAS_REFINERY(6, 0, 3, 0, 0),
    HEAL(3, 2, 0, 0, 0),
    NUCLEAR_POWER_PLANT(6, 3, 0, 2, 0),
    SKYSCREAPER(6, 0, 0, 4, 0),
    AMUSEMENT_PARK(6, 0, 0, 4, 0);

    private int healing;
    private int damage;
    private int score;
    private int energy;
    private int cost;

    DiscardCards(int cost, int healing, int damage, int score, int energy) {
        this.healing = healing;
        this.damage = damage;
        this.score = score;
        this.energy = energy;
        this.cost = cost;
    }
    public int[] getEffect() {
        int[] effects = {healing, damage, score, energy};
        return effects;
    }
    public int getCost() {
        return cost;
    }
}
