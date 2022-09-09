package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class FourOfKindTest {
    @Test
    public void shouldSayIfTheHandIsFourOfAKind(){
        FourOFKindIndentifier fourOFKindIndentifier = new FourOFKindIndentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue. SIX, 'C'),
        });
        assertTrue(fourOFKindIndentifier.identify(hand));
    }

    @Test
    public void shouldSayIfTheHandNotIsFourOfAKind(){
        FourOFKindIndentifier fourOFKindIndentifier = new FourOFKindIndentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue. SIX, 'C'),
        });
        assertFalse(fourOFKindIndentifier.identify(hand));
    }
}
