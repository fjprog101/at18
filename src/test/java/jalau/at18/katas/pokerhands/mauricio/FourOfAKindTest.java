package jalau.at18.katas.pokerhands.mauricio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FourOfAKindTest {
    @Test
    public void shouldHaveFourOfAKindThePokerHand(){
        PokerHand handWithFullHousePerHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        FourOfAKind fourOfAKind = new FourOfAKind(CardValue.TWO, CardValue.ACE);
        assertTrue(fourOfAKind.match(handWithFullHousePerHand));
    }

    @Test
    public void shouldNotHaveFourOfAKindOnThePokerHand(){
        PokerHand handWithoutFullHousePerHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.TWO, 'S'),
        });
        FourOfAKind fourOfAKind = new FourOfAKind(CardValue.TWO, CardValue.THREE);
        assertFalse(fourOfAKind.match(handWithoutFullHousePerHand));
    }

    @Test
    public void shouldNotHaveFourOfAKindOnThePokerHand2(){
        PokerHand handWithoutFullHousePerHand = new PokerHand(new Card[]{
            new Card(CardValue.QUEEN, 'C'),
            new Card(CardValue.QUEEN, 'D'),
            new Card(CardValue.QUEEN, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        FourOfAKind fourOfAKind = new FourOfAKind(CardValue.QUEEN, CardValue.ACE);
        assertFalse(fourOfAKind.match(handWithoutFullHousePerHand));
    }
}
