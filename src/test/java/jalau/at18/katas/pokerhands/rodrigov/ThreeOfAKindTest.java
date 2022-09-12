package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeOfAKindTest {
    @Test
    public void shouldSayIfThereAreThreeOfaKindInHand (){
        ThreeOfAKindIdentifier threeOfAKindIdentifier = new ThreeOfAKindIdentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.FOUR,'S'),
            new Card(CardValue.SEVEN,'H'),
            new Card(CardValue.FOUR,'S'),
            new Card(CardValue.FOUR,'C'),
            new Card(CardValue.THREE,'D')
        });
        assertTrue(threeOfAKindIdentifier.identify(hand)); 
    }

    @Test
    public void shouldSayIfThereAreNotThreeOfaKindInHand (){
        ThreeOfAKindIdentifier threeOfaKindInHand = new ThreeOfAKindIdentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.SEVEN,'S'),
            new Card(CardValue.FOUR,'H'),
            new Card(CardValue.SEVEN,'S'),
            new Card(CardValue.FOUR,'C'),
            new Card(CardValue.FOUR,'D')
        });
        assertFalse(threeOfaKindInHand.identify(hand)); 
    }

    @Test
    public void shouldReturnThreeOfAKindRank(){
        ThreeOfAKindIdentifier threeOfAKindIdentifier = new ThreeOfAKindIdentifier();
        assertEquals("THREEOFAKIND", threeOfAKindIdentifier.identifyRank().toString());
    }
}
