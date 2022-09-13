package jalau.at18.katas.pokerhands.daniela;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoPairsIdentifier {

    @Test
    public void shouldReturnTwoPairs() {
        Twopairidentifier twopairs = new Twopairidentifier();
        PokerHand handWithGroupsOfTwopairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'D'),
                new Card(CardValue.SEVEN, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.NINE, 'C'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertTrue(twopairs.identify(handWithGroupsOfTwopairs));
    }

    @Test
    public void shouldReturnFalseForTwoPairs() {
        Twopairidentifier twopairs = new Twopairidentifier();
        PokerHand handWithGroupsOfTwopairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'D'),
                new Card(CardValue.SEVEN, 'D'),
                new Card(CardValue.SIX, 'S'),
                new Card(CardValue.NINE, 'C'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertFalse(twopairs.identify(handWithGroupsOfTwopairs));
    }

    /*
     * @Test
     * public void shouldReturnHighCard() {
     * HighCard twopairs = new HighCard();
     * PokerHand handWithGroupsOfTwopairs = new PokerHand(new Card[] {
     * new Card(CardValue.TWO, 'H'),
     * new Card(CardValue.THREE, 'D'),
     * new Card(CardValue.FOUR, 'D'),
     * new Card(CardValue.FIVE, 'S'),
     * new Card(CardValue.SIX, 'C'),
     * });
     * // Twopairidentifier twopairs = new Twopairidentifier();
     * assertFalse(twopairs.oneHighCard(handWithGroupsOfTwopairs));
     * }
     */

}
