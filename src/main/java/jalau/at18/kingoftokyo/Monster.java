package jalau.at18.kingoftokyo;

public class Monster {
    private final String name;
    private int lifePoints;
    private int victoryPoints;
    private static final int TEN = 10;
    public Monster(String name) {
        this.name = name;
        this.lifePoints = TEN;
        this.victoryPoints = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getLifePoints() {
        return this.lifePoints;
    }

    public int getVictoryPoints() {
        return this.victoryPoints;
    }
}
