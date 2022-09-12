package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class OnePairIdentifierTest {
    @Test
    public void shouldSayIfTheHandHaveOnePair(){
        OnePairIdentifier onePairIdentifier = new OnePairIdentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.THREE, 'H'),
        });
        assertTrue(onePairIdentifier.identify(hand));
    }

    @Test
    public void shouldSayIfTheHandDoesntHaveOnePair(){
        OnePairIdentifier onePairIdentifier = new OnePairIdentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.SIX, 'H'),
        });
        assertFalse(onePairIdentifier.identify(hand));;
    }

    @Test
    public void shouldReturnOnePairRank(){
        OnePairIdentifier onePairIdentifier = new OnePairIdentifier();
        assertEquals("PAIR", onePairIdentifier.identifyRank().toString());
        System.out.println(onePairIdentifier.identifyRank().toString());
    }
}
