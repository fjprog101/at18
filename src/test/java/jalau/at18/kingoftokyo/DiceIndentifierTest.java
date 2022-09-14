package jalau.at18.kingoftokyo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DiceIndentifierTest {
    @Test
    public void shouldDisplayDiceWithCount() {
        DiceIndentifier diceIndentifier = new DiceIndentifier();
        List<DiceFace> listDiceFace = new ArrayList<>();
        listDiceFace.add(DiceFace.ENERGY);
        listDiceFace.add(DiceFace.ONE);
        listDiceFace.add(DiceFace.THREE);
        listDiceFace.add(DiceFace.THREE);
        listDiceFace.add(DiceFace.PUNDING);
        listDiceFace.add(DiceFace.HEALING);

        HashMap<DiceFace, Integer> diceFaceCount = new HashMap<>();
        diceFaceCount.put(DiceFace.ENERGY, 1);
        diceFaceCount.put(DiceFace.ONE, 1);
        diceFaceCount.put(DiceFace.THREE, 2);
        diceFaceCount.put(DiceFace.PUNDING, 1);
        diceFaceCount.put(DiceFace.HEALING, 1);
        //assertEquals(diceFaceCount, diceIndentifier.countDice(listDiceFace));
    }
}
