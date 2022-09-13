package jalau.at18.kingoftokyo;

public enum DiscardCards {
    ENERGIZER(0, 0, 9);
    private int lifePoints;
    private int score;
    private int energy;

    DiscardCards(int lifePoints, int score, int energy) {
        this.lifePoints = lifePoints;
        this.score = score;
        this.energy = energy;
    }
    public int[] getEffect() {
        int[] effects = {lifePoints, score, energy};
        return effects;
    }
}
