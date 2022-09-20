package jalau.at18.kingoftokyo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DiceFaceKeeperResultTest {
    @Test
    public void shouldDisplayDiceFaceKeeperResultToAPlayerTurn() {
        DiceFaceKeeper diceFaceKeeper = new DiceFaceKeeper();
        List<DiceFace> listDiceFacePlayer = new ArrayList<>();
        listDiceFacePlayer.add(DiceFace.TWO);
        listDiceFacePlayer.add(DiceFace.TWO);
        listDiceFacePlayer.add(DiceFace.TWO);
        listDiceFacePlayer.add(DiceFace.HEALING);
        listDiceFacePlayer.add(DiceFace.HEALING);
        listDiceFacePlayer.add(DiceFace.PUNCHING);
        diceFaceKeeper.saveListDiceFace(listDiceFacePlayer);

        DiceFaceKeeperProcess diceFaceKeeperProcess = new DiceFaceKeeperProcess(diceFaceKeeper);

        DiceFaceKeeperResult diceKeeperResult = new DiceFaceKeeperResult(diceFaceKeeperProcess);
        DiceFaceTurnResult diceFaceTurnResult = diceKeeperResult.resultDiceFaceKeeper();

        assertEquals(2, diceFaceTurnResult.getScorePoint());
        assertEquals(2, diceFaceTurnResult.getHealingPoint());
        assertEquals(1, diceFaceTurnResult.getPunchingPoint());
    }
}
