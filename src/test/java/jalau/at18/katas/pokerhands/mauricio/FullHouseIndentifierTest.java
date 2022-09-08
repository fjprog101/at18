package jalau.at18.katas.pokerhands.mauricio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FullHouseIndentifierTest {
    @Test
    public void shouldIdentifyFullHouse() {
        FullHouseIdentifier identifier = new FullHouseIdentifier(CardValue.TWO, CardValue.SIX);

        PokerHand fullHouse= new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(fullHouse));
    }
    @Test
    public void shouldNotIdentifyFullHouse() {
        FullHouseIdentifier identifier = new FullHouseIdentifier(CardValue.TWO, CardValue.SIX);

        PokerHand notFullHouse = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(notFullHouse));
    }
}
