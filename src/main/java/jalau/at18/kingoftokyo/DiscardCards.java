package jalau.at18.kingoftokyo;

public enum DiscardCards {
    ENERGIZER(2, 0, 0, 9);

    private int lifePoints;
    private int score;
    private int energy;
    private int cost;

    DiscardCards(int cost, int lifePoints, int score, int energy) {
        this.lifePoints = lifePoints;
        this.score = score;
        this.energy = energy;
        this.cost = cost;
    }
    public int[] getEffect() {
        int[] effects = {lifePoints, score, energy};
        return effects;
    }
    public int getCost() {
        return cost;
    }
}
