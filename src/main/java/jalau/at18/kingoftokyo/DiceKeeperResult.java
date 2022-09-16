package jalau.at18.kingoftokyo;

import java.util.HashMap;

public class DiceKeeperResult {
    private static final int NUMBER_SCORE = 3;
    private DiceKeeperProcess diceKeeperProcess;

    public DiceKeeperResult() {
        this.diceKeeperProcess = new DiceKeeperProcess();
    }

    public DiceTurnResult resultDiceKeeper() {
        HashMap<DiceFace, Integer> diceFaceCount = diceKeeperProcess.countDiceFace();
        int scorePoint = calculateScorePoints(diceFaceCount, DiceFace.ONE)
                + calculateScorePoints(diceFaceCount, DiceFace.TWO)
                + calculateScorePoints(diceFaceCount, DiceFace.THREE);
        int healingPoint = diceFaceCount.getOrDefault(DiceFace.HEALING, 0);
        int energyPoint = diceFaceCount.getOrDefault(DiceFace.ENERGY, 0);
        int punchingPoint = diceFaceCount.getOrDefault(DiceFace.PUNDING, 0);
        return new DiceTurnResult(scorePoint, healingPoint, energyPoint, punchingPoint);
    }

    private int calculateScorePoints(HashMap<DiceFace, Integer> diceFaceCount, DiceFace diceFace) {
        if (!diceFaceCount.containsKey(diceFace) || diceFaceCount.get(diceFace) < NUMBER_SCORE) {
            return 0;
        }
        Integer count = diceFaceCount.get(diceFace);
        return diceFace.getPointValue() + (count - NUMBER_SCORE);
    }
}
