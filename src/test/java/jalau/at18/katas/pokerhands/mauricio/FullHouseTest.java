package jalau.at18.katas.pokerhands.mauricio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FullHouseTest {
    @Test
    public void shouldHaveFullHouseThePokerHand(){
        PokerHand handWithFullHousePerHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        FullHouse fullHouse = new FullHouse(CardValue.TWO, CardValue.ACE);
        assertTrue(fullHouse.match(handWithFullHousePerHand));
    }

    @Test
    public void shouldNotHaveFullHouseOnThePokerHand(){
        PokerHand handWithoutFullHousePerHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        FullHouse fullHouse = new FullHouse(CardValue.TWO, CardValue.SIX);
        assertFalse(fullHouse.match(handWithoutFullHousePerHand));
    }

    @Test
    public void shouldNotHaveFullHouseOnThePokerHand2(){
        PokerHand handWithoutFullHousePerHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        FullHouse fullHouse = new FullHouse(CardValue.TWO, CardValue.SIX);
        assertFalse(fullHouse.match(handWithoutFullHousePerHand));
    }
}
