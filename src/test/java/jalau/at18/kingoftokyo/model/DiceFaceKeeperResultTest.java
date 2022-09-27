package jalau.at18.kingoftokyo.model;

import org.junit.Test;

import jalau.at18.kingoftokyo.model.DiceFace;
import jalau.at18.kingoftokyo.model.DiceFaceKeeper;
import jalau.at18.kingoftokyo.model.DiceFaceKeeperProcess;
import jalau.at18.kingoftokyo.model.DiceFaceKeeperResult;
import jalau.at18.kingoftokyo.model.DiceFaceTurnResult;

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
