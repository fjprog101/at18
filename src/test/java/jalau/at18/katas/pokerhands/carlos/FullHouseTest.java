package jalau.at18.katas.pokerhands.carlos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FullHouseTest {
    @Test
    public void shouldIdentifyFullHouse() {
        FullHouse identifier = new FullHouse();

        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'H'),
        });
        assertTrue(identifier.match(hand));   
    } 

    @Test
    public void shouldNotIdentifyFullHouse() {
        FullHouse identifier = new FullHouse();

        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
        });
        assertFalse(identifier.match(hand));   
        
    } 
}
