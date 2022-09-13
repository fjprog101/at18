package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class PokerHandAnalizerTest {

    @Test
    public void shouldSayIfHandNCardsWithSameValue() {
        PokerHandAnalizer analizer = new PokerHandAnalizer();
        CardsWithSameValue have2CardsWithSameValue = new CardsWithSameValue(2);
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'H'));
        input.add(new Card(CardValue.FIVE, 'D'));
        input.add(new Card(CardValue.FOUR, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand handWith2CardsWithSameValue = new PokerHand(input);
        assertTrue(analizer.analize(handWith2CardsWithSameValue, have2CardsWithSameValue));

        List<Card> input2 = new LinkedList<>();
        input2.add(new Card(CardValue.TWO, 'C'));
        input2.add(new Card(CardValue.THREE, 'H'));
        input2.add(new Card(CardValue.THREE, 'D'));
        input2.add(new Card(CardValue.THREE, 'S'));
        input2.add(new Card(CardValue.SIX, 'C'));
        CardsWithSameValue have3CardsWithSameValue = new CardsWithSameValue(3);
        PokerHand handWith3CardsWithSameValue = new PokerHand(input2);
        assertTrue(analizer.analize(handWith3CardsWithSameValue, have3CardsWithSameValue));

        List<Card> input3 = new LinkedList<>();
        input3.add(new Card(CardValue.TWO, 'C'));
        input3.add(new Card(CardValue.JACK, 'H'));
        input3.add(new Card(CardValue.JACK, 'D'));
        input3.add(new Card(CardValue.JACK, 'S'));
        input3.add(new Card(CardValue.JACK, 'C'));
        CardsWithSameValue have4CardsWithSameValue = new CardsWithSameValue(4);
        PokerHand handWith4CardsWithSameValue = new PokerHand(input3);
        assertTrue(analizer.analize(handWith4CardsWithSameValue, have4CardsWithSameValue));

        assertFalse(analizer.analize(handWith2CardsWithSameValue, have3CardsWithSameValue));
        assertFalse(analizer.analize(handWith3CardsWithSameValue, have4CardsWithSameValue));
        assertFalse(analizer.analize(handWith4CardsWithSameValue, have2CardsWithSameValue));
    }

    @Test
    public void shouldSayIfHandHasConsecutiveValues() {
        PokerHandAnalizer analizer = new PokerHandAnalizer();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.THREE, 'H'));
        input.add(new Card(CardValue.FOUR, 'D'));
        input.add(new Card(CardValue.FIVE, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand hand = new PokerHand(input);
        assertTrue(analizer.analize(hand, consecutiveValues));
    }

    @Test
    public void shouldSayIfHandHasAllCardsWithSameSuit() {
        PokerHandAnalizer analizer = new PokerHandAnalizer();
        AllSameSuit allSameSuit = new AllSameSuit();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.FIVE, 'C'));
        input.add(new Card(CardValue.FIVE, 'C'));
        input.add(new Card(CardValue.FOUR, 'C'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand allSameSuitHand = new PokerHand(input);
        assertTrue(analizer.analize(allSameSuitHand, allSameSuit));

        List<Card> input2 = new LinkedList<>();
        input2.add(new Card(CardValue.TWO, 'C'));
        input2.add(new Card(CardValue.FOUR, 'S'));
        input2.add(new Card(CardValue.FIVE, 'S'));
        input2.add(new Card(CardValue.FIVE, 'H'));
        input2.add(new Card(CardValue.SIX, 'C'));
        PokerHand notAllSameSuitHand = new PokerHand(input2);
        assertFalse(analizer.analize(notAllSameSuitHand, allSameSuit));
    }
}
