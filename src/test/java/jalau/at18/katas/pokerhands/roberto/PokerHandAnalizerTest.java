package jalau.at18.katas.pokerhands.roberto;

import jalau.at18.katas.pokerhands.joseg.AllSameSuit;
import jalau.at18.katas.pokerhands.joseg.Card;
import jalau.at18.katas.pokerhands.joseg.CardValue;
import jalau.at18.katas.pokerhands.joseg.CardsWithSameValue;
import jalau.at18.katas.pokerhands.joseg.ConsecutiveValues;
import jalau.at18.katas.pokerhands.joseg.PokerHand;
import jalau.at18.katas.pokerhands.joseg.PokerHandAnalizer;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PokerHandAnalizerTest {

    @Test
    public void shouldSayIfHandNCardsWithSameValue() {
        jalau.at18.katas.pokerhands.joseg.PokerHandAnalizer analizer = new jalau.at18.katas.pokerhands.joseg.PokerHandAnalizer();
        jalau.at18.katas.pokerhands.joseg.CardsWithSameValue have2CardsWithSameValue = new jalau.at18.katas.pokerhands.joseg.CardsWithSameValue(2);

        jalau.at18.katas.pokerhands.joseg.PokerHand handWith2CardsWithSameValue = new jalau.at18.katas.pokerhands.joseg.PokerHand(new jalau.at18.katas.pokerhands.joseg.Card[]{
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'D'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FOUR, 'H'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, 'S'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.SIX, 'S'),
        });
        assertTrue(analizer.analize(handWith2CardsWithSameValue, have2CardsWithSameValue));

        jalau.at18.katas.pokerhands.joseg.CardsWithSameValue have3CardsWithSameValue = new jalau.at18.katas.pokerhands.joseg.CardsWithSameValue(3);
        jalau.at18.katas.pokerhands.joseg.PokerHand handWith3CardsWithSameValue = new jalau.at18.katas.pokerhands.joseg.PokerHand(new jalau.at18.katas.pokerhands.joseg.Card[]{
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.THREE, 'D'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.THREE, 'H'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.THREE, 'S'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.SIX, 'S'),
        });
        assertTrue(analizer.analize(handWith3CardsWithSameValue, have3CardsWithSameValue));

        jalau.at18.katas.pokerhands.joseg.CardsWithSameValue have4CardsWithSameValue = new CardsWithSameValue(4);
        jalau.at18.katas.pokerhands.joseg.PokerHand handWith4CardsWithSameValue = new jalau.at18.katas.pokerhands.joseg.PokerHand(new jalau.at18.katas.pokerhands.joseg.Card[]{
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, 'D'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, 'H'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, 'S'),
        });
        assertTrue(analizer.analize(handWith4CardsWithSameValue, have4CardsWithSameValue));

        assertFalse(analizer.analize(handWith2CardsWithSameValue, have3CardsWithSameValue));
        assertFalse(analizer.analize(handWith3CardsWithSameValue, have4CardsWithSameValue));
        assertFalse(analizer.analize(handWith4CardsWithSameValue, have2CardsWithSameValue));
    }

    @Test
    public void shouldSayIfHandHasConsecutiveValues() {
        jalau.at18.katas.pokerhands.joseg.PokerHandAnalizer analizer = new jalau.at18.katas.pokerhands.joseg.PokerHandAnalizer();
        jalau.at18.katas.pokerhands.joseg.ConsecutiveValues consecutiveValues = new ConsecutiveValues();

        jalau.at18.katas.pokerhands.joseg.PokerHand hand = new jalau.at18.katas.pokerhands.joseg.PokerHand(new jalau.at18.katas.pokerhands.joseg.Card[]{
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.THREE, 'D'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FOUR, 'H'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, 'S'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.SIX, 'S'),
        });
        assertTrue(analizer.analize(hand, consecutiveValues));
    }

    @Test
    public void shouldSayIfHandHasAllCardsWithSameSuit() {
        jalau.at18.katas.pokerhands.joseg.PokerHandAnalizer analizer = new PokerHandAnalizer();
        jalau.at18.katas.pokerhands.joseg.AllSameSuit allSameSuit = new AllSameSuit();
        jalau.at18.katas.pokerhands.joseg.PokerHand allSameSuitHand = new jalau.at18.katas.pokerhands.joseg.PokerHand(new jalau.at18.katas.pokerhands.joseg.Card[]{
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FOUR, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.SIX, 'C'),
        });
        assertTrue(analizer.analize(allSameSuitHand, allSameSuit));

        jalau.at18.katas.pokerhands.joseg.PokerHand notAllSameSuitHand = new PokerHand(new jalau.at18.katas.pokerhands.joseg.Card[]{
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FOUR, 'S'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, 'S'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(analizer.analize(notAllSameSuitHand, allSameSuit));
    }
}
