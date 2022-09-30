package jalau.at18.kingoftokyo.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DiceRollerTest {
    @Test
    public void shouldReturnListRandomDice() {
        final int countDicesAvailables = 3;
        DiceRoller diceRoller = new DiceRoller();
        List<DiceFace> listDiceFace = new ArrayList<>();
        listDiceFace = diceRoller.randomDice(countDicesAvailables);
        assertEquals(countDicesAvailables, listDiceFace.size());
    }
}
