package jalau.at18.katas.pokerhands.maria;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class InputProcessTest {
    private static final int SIZE_ARRAY = 5;

    @Test
    public void shouldSplitString() {
        InputProcess inputProcess = new InputProcess();
        String input = "Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C AH";
        List<String[]> listPlayers = new ArrayList<>();
        String[] array1 = {"Black:", "2H", "3D", "5S", "9C", "KD"};
        String[] array2 = {"White:", "2C", "3H", "4S", "8C", "AH"};
        listPlayers.add(array1);
        listPlayers.add(array2);
        assertArrayEquals(listPlayers.toArray(), inputProcess.splitInputString(input).toArray());
    }

    @Test
    public void hasCreateHand() {
        Card[] cards = new Card[SIZE_ARRAY];
        InputProcess inputProcess = new InputProcess();
        String[] handString = {"Black:", "2H", "3D", "5S", "9C", "KD"};
        Card card1 = new Card(CardValue.TWO, 'H');
        Card card2 = new Card(CardValue.THREE, 'D');
        Card card3 = new Card(CardValue.FIVE, 'S');
        Card card4 = new Card(CardValue.NINE, 'C');
        Card card5 = new Card(CardValue.KING, 'D');
        cards[0] = card5;
        cards[1] = card4;
        cards[2] = card3;
        cards[3] = card2;
        cards[4] = card1;
        PokerHand hand = new PokerHand(cards);
        assertEquals(hand.getCards()[0].getValue(), inputProcess.createHand(handString).getCards()[0].getValue());
        assertEquals(hand.getCards()[1].getValue(), inputProcess.createHand(handString).getCards()[1].getValue());
        assertEquals(hand.getCards()[2].getValue(), inputProcess.createHand(handString).getCards()[2].getValue());
        assertEquals(hand.getCards()[3].getValue(), inputProcess.createHand(handString).getCards()[3].getValue());
        assertEquals(hand.getCards()[4].getValue(), inputProcess.createHand(handString).getCards()[4].getValue());
    }
}
