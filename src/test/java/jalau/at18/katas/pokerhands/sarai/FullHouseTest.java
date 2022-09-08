package jalau.at18.katas.pokerhands.sarai;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FullHouseTest {
    @Test
    public void fullHouse() {

        FullHouse full = new FullHouse();
        PokerHand FullHousehand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'H'),
        });
        assertTrue(full.match(FullHousehand));

        FullHouse full2 = new FullHouse();
        PokerHand FullHousehand2 = new PokerHand(new Card[] {
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'H'),
        });
        assertTrue(full2.match(FullHousehand2));
    }
    
    @Test
    public void fullHouseFalse() {

        FullHouse fullfalse = new FullHouse();
        PokerHand FullHousehandfalse1 = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
        });
        assertFalse(fullfalse.match(FullHousehandfalse1));

        FullHouse fullfalse2 = new FullHouse();
        PokerHand FullHousehandfalse2 = new PokerHand(new Card[] {
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SEVEN, 'C'),
            new Card(CardValue.SIX, 'H'),
        });
        assertFalse(fullfalse2.match(FullHousehandfalse2));

        FullHouse fullfalse3 = new FullHouse();
        PokerHand FullHousehandfalse3 = new PokerHand(new Card[] {
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'H'),
        });
        assertFalse(fullfalse3.match(FullHousehandfalse3));
    }

}
