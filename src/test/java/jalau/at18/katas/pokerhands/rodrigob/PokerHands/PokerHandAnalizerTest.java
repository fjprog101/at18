package jalau.at18.katas.pokerhands.rodrigob.PokerHands;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.Cards.CardValue;
import jalau.at18.katas.pokerhands.rodrigob.CardsPatterns.AllSameSuit;
import jalau.at18.katas.pokerhands.rodrigob.CardsPatterns.CardsWithSameValue;
import jalau.at18.katas.pokerhands.rodrigob.CardsPatterns.ConsecutiveValues;

public class PokerHandAnalizerTest {

    @Test
    public void shouldSayIfHandNCardsWithSameValue() {
        PokerHandAnalizer analizer = new PokerHandAnalizer();
        CardsWithSameValue have2CardsWithSameValue = new CardsWithSameValue(2);

        PokerHand handWith2CardsWithSameValue = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S')
        ));
        assertTrue(analizer.analize(handWith2CardsWithSameValue, have2CardsWithSameValue));

        CardsWithSameValue have3CardsWithSameValue = new CardsWithSameValue(3);
        PokerHand handWith3CardsWithSameValue = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.SIX, 'S')
        ));
        assertTrue(analizer.analize(handWith3CardsWithSameValue, have3CardsWithSameValue));

        CardsWithSameValue have4CardsWithSameValue = new CardsWithSameValue(4);
        PokerHand handWith4CardsWithSameValue = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.JACK, 'H'),
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.JACK, 'S')
        ));
        assertTrue(analizer.analize(handWith4CardsWithSameValue, have4CardsWithSameValue));

        assertFalse(analizer.analize(handWith2CardsWithSameValue, have3CardsWithSameValue));
        assertFalse(analizer.analize(handWith3CardsWithSameValue, have4CardsWithSameValue));
        assertFalse(analizer.analize(handWith4CardsWithSameValue, have2CardsWithSameValue));
    }

    @Test
    public void shouldSayIfHandHasConsecutiveValues() {
        PokerHandAnalizer analizer = new PokerHandAnalizer();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();

        PokerHand hand = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S')
        ));
        assertTrue(analizer.analize(hand, consecutiveValues));
    }

    @Test
    public void shouldSayIfHandHasAllCardsWithSameSuit() {
        PokerHandAnalizer analizer = new PokerHandAnalizer();
        AllSameSuit allSameSuit = new AllSameSuit();
        PokerHand allSameSuitHand = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertTrue(analizer.analize(allSameSuitHand, allSameSuit));

        PokerHand notAllSameSuitHand = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'C')
        ));
        assertFalse(analizer.analize(notAllSameSuitHand, allSameSuit));
    }
}
