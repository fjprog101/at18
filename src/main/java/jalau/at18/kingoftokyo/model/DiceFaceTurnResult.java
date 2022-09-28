package jalau.at18.kingoftokyo.model;

public class DiceFaceTurnResult {
    private int scorePoint;
    private int healingPoint;
    private int energyPoint;
    private int punchingPoint;

    public DiceFaceTurnResult(int scorePoint, int healingPoint, int energyPoint, int punchingPoint) {
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
