package jalau.at18.katas.pokerhands.carlos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PairsTest {
    @Test
    public void shouldIdentifyPairs() {
        Pairs identifier = new Pairs();
        PokerHand pairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.match(pairs));   
    } 
    @Test
    public void shouldNotIdentifyPairs() {
        Pairs identifier = new Pairs();
        PokerHand pairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.match(pairs));   
    } 
}
