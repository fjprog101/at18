package jalau.at18.katas.pokerhands.carlos;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeOfAKindTest {
    @Test
    public void shouldIdentifyThreeOfAKind() {
        ThreeOfAKind identifier = new ThreeOfAKind();
        PokerHand threeCards = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.match(threeCards));     
    } 
}
