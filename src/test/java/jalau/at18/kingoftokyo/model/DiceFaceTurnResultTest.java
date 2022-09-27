package jalau.at18.kingoftokyo.model;

import org.junit.Test;

import jalau.at18.kingoftokyo.model.DiceFaceTurnResult;

import static org.junit.Assert.assertEquals;

public class DiceFaceTurnResultTest {
    @Test
    public void shouldReturnDiceScoreByTurn() {
        DiceFaceTurnResult diceFaceTurnResult = new DiceFaceTurnResult(0, 1, 2, 1);
        assertEquals(0, diceFaceTurnResult.getScorePoint());
        assertEquals(1, diceFaceTurnResult.getHealingPoint());
        assertEquals(2, diceFaceTurnResult.getEnergyPoint());
        assertEquals(1, diceFaceTurnResult.getPunchingPoint());

    }
}
