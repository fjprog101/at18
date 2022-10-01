package jalau.at18.kingoftokyo.model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import java.util.List;

public class DiceRollerTest {

    @Test
    public void diceRoller() {

        int countDicesAvailables = 6;
        DiceRoller diceRoller = new DiceRoller();

        List<DiceFace> newList =  diceRoller.randomDice(countDicesAvailables);
        List<DiceFace> ListDiceFace = Arrays.asList(DiceFace.values());
        assertTrue(ListDiceFace.contains(newList.get(0)));
    }
}
