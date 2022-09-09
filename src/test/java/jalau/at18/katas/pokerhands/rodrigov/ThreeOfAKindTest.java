package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeOfAKindTest {
    @Test
    public void shouldSayIfThereAreThreeOfaKindInHand (){
        ThreeOfAKind threeOfaKindInHand = new ThreeOfAKind();
        CardComparer comparer = new CardComparer();
        PokerHand threeOfKind = new PokerHand(new Card[]{
            new Card(CardValue.SEVEN,'S'),
            new Card(CardValue.FOUR,'H'),
            new Card(CardValue.FOUR,'S'),
            new Card(CardValue.FOUR,'C'),
            new Card(CardValue.THREE,'D')
        });
        threeOfaKindInHand.compareCardsThreeofKind(threeOfKind, comparer);
        assertTrue(threeOfaKindInHand.identifyThreeOfKind());
    }

    @Test
    public void shouldSayIfThereAreNotThreeOfaKindInHand (){
        ThreeOfAKind threeOfaKindInHand = new ThreeOfAKind();
        CardComparer comparer = new CardComparer();
        PokerHand threeOfKind = new PokerHand(new Card[]{
            new Card(CardValue.SEVEN,'S'),
            new Card(CardValue.FOUR,'H'),
            new Card(CardValue.SIX,'S'),
            new Card(CardValue.FOUR,'C'),
            new Card(CardValue.THREE,'D')
        });
        threeOfaKindInHand.compareCardsThreeofKind(threeOfKind, comparer);
        assertFalse(threeOfaKindInHand.identifyThreeOfKind());
    }
}
