package jalau.at18.kingoftokyo;

public class DiceTurnResult {
    private int scorePoint;
    private int healingPoint;
    private int energyPoint;
    private int punchingPoint;

    public DiceTurnResult(int scorePoint, int healingPoint, int energyPoint, int punchingPoint) {
        this.scorePoint = scorePoint;
        this.healingPoint = healingPoint;
        this.energyPoint = energyPoint;
        this.punchingPoint = punchingPoint;
    }

    public int getScorePoint() {
        return scorePoint;
    }

    public int getHealingPoint() {
        return healingPoint;
    }

    public int getEnergyPoint() {
        return energyPoint;
    }

    public int getPunchingPoint() {
        return punchingPoint;
    }
}
