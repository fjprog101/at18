package jalau.at18.kingoftokyo.model;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class StartGameTest {
    @Test
    public void whoStartsTheGame() {
 //_________________________player 1
        List<Dice> listDice = new ArrayList<>();
        Dice dice1 = new Dice(DiceFace.ENERGY);
        Dice dice2 = new Dice(DiceFace.ONE);
        Dice dice3 = new Dice(DiceFace.PUNCHING);
        Dice dice4 = new Dice(DiceFace.PUNCHING);
        Dice dice5 = new Dice(DiceFace.PUNCHING);
        Dice dice6 = new Dice(DiceFace.HEALING);

        listDice.add(dice1);
        listDice.add(dice2);
        listDice.add(dice3);
        listDice.add(dice4);
        listDice.add(dice5);
        listDice.add(dice6); 

        DiceHand  dicehand = new DiceHand(listDice);

        //_________________________player 2
        List<Dice> listDiceW = new ArrayList<>();
        Dice dice1W = new Dice(DiceFace.ENERGY);
        Dice dice2W = new Dice(DiceFace.ONE);
        Dice dice3W = new Dice(DiceFace.THREE);
        Dice dice4W = new Dice(DiceFace.TWO);
        Dice dice5W = new Dice(DiceFace.PUNCHING);
        Dice dice6W = new Dice(DiceFace.HEALING);

        listDiceW.add(dice1W);
        listDiceW.add(dice2W);
        listDiceW.add(dice3W);
        listDiceW.add(dice4W);
        listDiceW.add(dice5W);
        listDiceW.add(dice6W); 

        DiceHand  dicehandW = new DiceHand(listDiceW);
        StartGame whoStart = new StartGame(dicehand, dicehandW);
        assertEquals("Start Play player 1", whoStart.getWhoStart());
    }
    @Test
    public void whoStartsTheGame2() {
 //_________________________player 1
        List<Dice> listDice = new ArrayList<>();
        Dice dice1 = new Dice(DiceFace.ENERGY);
        Dice dice2 = new Dice(DiceFace.ONE);
        Dice dice3 = new Dice(DiceFace.PUNCHING);
        Dice dice4 = new Dice(DiceFace.HEALING);
        Dice dice5 = new Dice(DiceFace.THREE);
        Dice dice6 = new Dice(DiceFace.HEALING);

        listDice.add(dice1);
        listDice.add(dice2);
        listDice.add(dice3);
        listDice.add(dice4);
        listDice.add(dice5);
        listDice.add(dice6); 

        DiceHand  dicehand = new DiceHand(listDice);

        //_________________________player 2
        List<Dice> listDiceW = new ArrayList<>();
        Dice dice1W = new Dice(DiceFace.ENERGY);
        Dice dice2W = new Dice(DiceFace.ONE);
        Dice dice3W = new Dice(DiceFace.THREE);
        Dice dice4W = new Dice(DiceFace.TWO);
        Dice dice5W = new Dice(DiceFace.PUNCHING);
        Dice dice6W = new Dice(DiceFace.PUNCHING);

        listDiceW.add(dice1W);
        listDiceW.add(dice2W);
        listDiceW.add(dice3W);
        listDiceW.add(dice4W);
        listDiceW.add(dice5W);
        listDiceW.add(dice6W); 

        DiceHand  dicehandW = new DiceHand(listDiceW);
        StartGame whoStart = new StartGame(dicehand, dicehandW);
        assertEquals("Start Play player 2", whoStart.getWhoStart());
    }
}
