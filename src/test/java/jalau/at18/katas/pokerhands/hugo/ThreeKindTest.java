package jalau.at18.katas.pokerhands.hugo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeKindTest {

    @Test
    public void shouldVerifyThereAreTwoPairs() {

        ThreeKind threeOfAKind = new ThreeKind();
        PokerHand handWithThreeKind = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.NINE, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        assertTrue(threeOfAKind.identify(handWithThreeKind));

        ThreeKind twoPairs = new ThreeKind();
        PokerHand handWithTwoPairs = new PokerHand(new Card[]{
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SEVEN, 'S'),
        });
        assertFalse(twoPairs.identify(handWithTwoPairs));

        ThreeKind onePair = new ThreeKind();
        PokerHand handWithOnePair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.EIGHT, 'S'),
        });
        assertFalse(onePair.identify(handWithOnePair));

        ThreeKind noPair = new ThreeKind();
        PokerHand handWithNoPair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.NINE, 'S'),
        });
        assertFalse(noPair.identify(handWithNoPair));
        
        ThreeKind fourOfAKind = new ThreeKind();
        PokerHand handWithFourKind = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        assertFalse(fourOfAKind.identify(handWithFourKind));
    }
}
