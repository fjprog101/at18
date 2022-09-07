package jalau.at18.katas.pokerhands.daniela;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FullHouseTest {
    @Test
    public void shouldIdentifyFullHouseHandCase1() {
        FullHouseidentify identifier = new FullHouseidentify(CardValue.THREE, CardValue.FIVE);

        PokerHand FullHouse = new PokerHand(new Card[] {
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.THREE, 'S'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'D'),
        });
        assertTrue(identifier.identify(FullHouse));
    }

    @Test
    public void shouldIdentifyFullHouseHandCase2() {
        FullHouseidentify identifier = new FullHouseidentify(CardValue.FIVE, CardValue.THREE);

        PokerHand FullHouse = new PokerHand(new Card[] {
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.FIVE, 'S'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'D'),
        });
        assertTrue(identifier.identify(FullHouse));
    }

    @Test
    public void shouldIdentifyFalseFullHouseHand() {
        FullHouseidentify identifier = new FullHouseidentify(CardValue.NINE, CardValue.THREE);

        PokerHand FullHouse = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.THREE, 'D'),
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.NINE, 'S'),
        });
        assertFalse(identifier.identify(FullHouse));
    }
}
