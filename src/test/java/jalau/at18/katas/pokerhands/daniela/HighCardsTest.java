package jalau.at18.katas.pokerhands.daniela;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HighCardsTest {
    @Test
    public void shouldReturnHighCard() {
        HighCardIdentifier highcard = new HighCardIdentifier();
        PokerHand handWithHighcard = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.TEN, 'H'),
                new Card(CardValue.SEVEN, 'D'),
                new Card(CardValue.SIX, 'S'),
                new Card(CardValue.NINE, 'C'),
        });
        assertTrue(highcard.identify(handWithHighcard));
    }

    @Test
    public void shouldNotReturnHighCard() {
        HighCardIdentifier highcard = new HighCardIdentifier();
        PokerHand handWithHighcard = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.SEVEN, 'D'),
                new Card(CardValue.SIX, 'S'),
                new Card(CardValue.NINE, 'C'),
        });
        assertFalse(highcard.identify(handWithHighcard));
    }

    @Test
    public void shouldNotReturnHighCard1() {
        HighCardIdentifier highcard = new HighCardIdentifier();
        PokerHand handWithNoHighcard = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'D'),
                new Card(CardValue.SIX, 'S'),
                new Card(CardValue.NINE, 'C'),
        });
        assertFalse(highcard.identify(handWithNoHighcard));
    }

    @Test
    public void shouldNotReturnHighCard2() {
        HighCardIdentifier highcard = new HighCardIdentifier();
        PokerHand handWithNoHighcard = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'D'),
                new Card(CardValue.JACK, 'S'),
                new Card(CardValue.NINE, 'C'),
        });
        assertFalse(highcard.identify(handWithNoHighcard));
    }
}
