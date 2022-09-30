package jalau.at18.kingoftokyo.model;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class DiceHandTest {
    @Test
    public void shouldGetListDice() {
        List<Dice> listDice = new ArrayList<>();
        Dice dice1 = new Dice(DiceFace.PUNCHING);
        Dice dice2 = new Dice(DiceFace.TWO);
        Dice dice3 = new Dice(DiceFace.ENERGY);
        Dice dice4 = new Dice(DiceFace.ONE);
        Dice dice5 = new Dice(DiceFace.THREE);
        Dice dice6 = new Dice(DiceFace.HEALING);
        listDice.add(dice1);
        listDice.add(dice2);
        listDice.add(dice3);
        listDice.add(dice4);
        listDice.add(dice5);
        listDice.add(dice6);
        DiceHand diceHand = new DiceHand(listDice);
        assertNotNull(diceHand.getListDices());
        assertEquals(6, diceHand.getListDices().size());
    }
}
