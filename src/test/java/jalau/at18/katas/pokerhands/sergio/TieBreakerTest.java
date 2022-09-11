package jalau.at18.katas.pokerhands.sergio;

import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TieBreakerTest {
    @Test
    public void shouldDeterminateHand1WinInTieBreak() {
        TieBreaker identifier = new TieBreaker();
        PokerHand hand1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.JACK, 'C'), });
        PokerHand hand2 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.NINE, 'C'), });
        assertTrue(identifier.tieBraker(hand1, hand2));

    }

    @Test
    public void shouldDeterminateHand2WinInTieBreak() {
        TieBreaker identifier = new TieBreaker();
        PokerHand hand1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.JACK, 'C'), });
        PokerHand hand2 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.ACE, 'C'), });
        assertFalse(identifier.tieBraker(hand1, hand2));
    }

}
