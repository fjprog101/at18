package jalau.at18.katas.pokerhands.carlos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FourOfAKindTest {
    @Test
    public void shouldIdentifyFourOfAKind() {
        FourOfAKind identifier = new FourOfAKind();

        PokerHand four = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.match(four));       
    }

    @Test
    public void shouldNotIdentifyFourOfAKind() {
        FourOfAKind identifier = new FourOfAKind();

        PokerHand four = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.match(four));   
        
    } 
    
}
