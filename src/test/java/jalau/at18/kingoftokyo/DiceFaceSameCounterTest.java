package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DiceFaceSameCounterTest {
    @Test
    public void shouldDisplayDiceWithCount() {

        DiceFaceIndentifier diceFaceIndentifier = new DiceFaceIndentifier();
        List<Dice> listDice = new ArrayList<>();
        Dice dice1 = new Dice(DiceFace.ENERGY);
        Dice dice2 = new Dice(DiceFace.ONE);
        Dice dice3 = new Dice(DiceFace.THREE);
        Dice dice4 = new Dice(DiceFace.THREE);
        Dice dice5 = new Dice(DiceFace.PUNCHING);
        Dice dice6 = new Dice(DiceFace.HEALING);

        listDice.add(dice1);
        listDice.add(dice2);
        listDice.add(dice3);
        listDice.add(dice4);
        listDice.add(dice5);
        listDice.add(dice6); 

        DiceHand  dicehand = new DiceHand(listDice);
        DiceFaceSameCounter dicefacesamecounter = new DiceFaceSameCounter(dicehand);

        DiceFaceIndentifier diceidentifier = dicefacesamecounter.diceFaceCounter();

        assertEquals(2, diceidentifier.getCountDiceFace(DiceFace.THREE));
    }
}
