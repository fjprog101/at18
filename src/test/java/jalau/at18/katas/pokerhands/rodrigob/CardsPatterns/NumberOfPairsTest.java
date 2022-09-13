package jalau.at18.katas.pokerhands.rodrigob.CardsPatterns;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.Cards.CardValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHandAnalizer;

public class NumberOfPairsTest {
    @Test
    public void shouldSayIfHandHasNNumberOfPairs() {
        PokerHandAnalizer analizer = new PokerHandAnalizer();
        NumberOfPairs twoPairs = new NumberOfPairs(2);
        PokerHand handWith2Pairs = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S')
        ));
        assertTrue(analizer.analize(handWith2Pairs, twoPairs));

        NumberOfPairs onePair = new NumberOfPairs(1);
        PokerHand handWith1Pair = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SEVEN, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S')
        ));
        assertTrue(analizer.analize(handWith1Pair, onePair));

        NumberOfPairs noPair = new NumberOfPairs(2);
        PokerHand handWith0Pair = new PokerHand(Arrays.asList(
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SEVEN, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S')
        ));
        assertFalse(analizer.analize(handWith0Pair, noPair));

        assertFalse(analizer.analize(handWith2Pairs, onePair));
        assertFalse(analizer.analize(handWith1Pair, twoPairs));
    }
}
