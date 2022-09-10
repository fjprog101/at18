package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.maria.Identifier.HighCardIdentifier;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighCardIdentifierTest {
    @Test
    public void shouldBeHighCard() {
        HighCardIdentifier identifier = new HighCardIdentifier();
        PokerHand highCardHand = new PokerHand(new Card[]{
                new Card(CardValue.SEVEN, 'C'),
                new Card(CardValue.TWO, 'S'),
                new Card(CardValue.NINE, 'H'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.ACE, 'D'),
        });
        assertTrue(identifier.identify(highCardHand));
    }

    @Test
    public void shouldGetHighCardRank() {
        HighCardIdentifier identifier = new HighCardIdentifier();

        PokerHand highCardHand = new PokerHand(new Card[]{
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.SEVEN, 'S'),
        });
        assertEquals(CardValue.JACK, identifier.getRank(highCardHand).getCardValue());
    }

}
