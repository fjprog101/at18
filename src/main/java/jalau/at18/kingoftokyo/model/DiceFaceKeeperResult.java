package jalau.at18.kingoftokyo.model;
import java.util.HashMap;

public class DiceFaceKeeperResult {
    private static final int NUMBER_SCORE = 3;
    private DiceFaceKeeperProcess diceFaceKeeperProcess;

    public DiceFaceKeeperResult(DiceFaceKeeperProcess diceFaceKeeperProcess) {
        this.diceFaceKeeperProcess = diceFaceKeeperProcess;
    }

    public DiceFaceTurnResult resultDiceFaceKeeper() {
        HashMap<DiceFace, Integer> diceFaceCount = diceFaceKeeperProcess.countDiceFace();
        int scorePoint = calculateScorePoints(diceFaceCount, DiceFace.ONE)
                + calculateScorePoints(diceFaceCount, DiceFace.TWO)
                + calculateScorePoints(diceFaceCount, DiceFace.THREE);
        int healingPoint = diceFaceCount.getOrDefault(DiceFace.HEALING, 0);
        int energyPoint = diceFaceCount.getOrDefault(DiceFace.ENERGY, 0);
        int punchingPoint = diceFaceCount.getOrDefault(DiceFace.PUNCHING, 0);
        return new DiceFaceTurnResult(scorePoint, healingPoint, energyPoint, punchingPoint);
    }

    private int calculateScorePoints(HashMap<DiceFace, Integer> diceFaceCount, DiceFace diceFace) {
        if (!diceFaceCount.containsKey(diceFace) || diceFaceCount.get(diceFace) < NUMBER_SCORE) {
            return 0;
        }
        Integer count = diceFaceCount.get(diceFace);
        return diceFace.getPointValue() + (count - NUMBER_SCORE);
    }
}
