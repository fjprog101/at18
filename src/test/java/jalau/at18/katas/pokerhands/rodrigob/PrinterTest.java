package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.junit.Test;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.Cards.CardValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class PrinterTest {

    @Test
    public void shouldPrintTheWinnerNameAndTheirHand() {
        Printer printer = new Printer();

        PokerHand handWinner = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S')
        ));

        Player playerWinner = new Player(handWinner, "Andres");

        assertEquals("Andres wins. - with ONEPAIR", printer.output(playerWinner));
        assertNotEquals("Andres wins. - with TWOPAIR", printer.output(playerWinner));

        Player tie = new Player(null, "Tie");
        assertEquals("Tie.", printer.output(tie));

    }
}
