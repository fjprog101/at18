package jalau.at18.katas.pokerhands.daniela;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CardssortedTest {

    @Test
    public void shouldHaveCountsPerCardValue() {
        CardstoString analizer = new CardstoString();
        analizer.add(CardValue.ACE);
        analizer.add(CardValue.JACK);
        analizer.add(CardValue.FIVE);

        assertEquals("14115", analizer.get(CardValue.ACE));

    }

    @Test
    public void shouldIncrementCountForExistingCardValue() {
        CardstoString analizer = new CardstoString();
        analizer.add(CardValue.ACE);
        analizer.add(CardValue.ACE);
        analizer.add(CardValue.ACE);
        analizer.add(CardValue.JACK);
        analizer.add(CardValue.JACK);

        assertEquals("1414141111", analizer.get(CardValue.ACE));
    }

    @Test
    public void shouldReturnthevaluesCardsinString() {
        PokerHand handWithGroupsOf2And3 = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'C'),
                new Card(CardValue.JACK, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.SEVEN, 'S'),
                new Card(CardValue.SEVEN, 'C'),
        });

        Cardssorted counter = new Cardssorted(handWithGroupsOf2And3);
        CardstoString count = counter.getCount();
        assertEquals("7771111", count.get(CardValue.JACK));
    }

    @Test
    public void shouldReturnthevaluesCardsinStringprueve2() {
        PokerHand handWithGroupsOf2And3 = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'C'),
                new Card(CardValue.TEN, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.SIX, 'S'),
                new Card(CardValue.SEVEN, 'C'),
        });

        Cardssorted counter = new Cardssorted(handWithGroupsOf2And3);
        CardstoString count = counter.getCount();
        assertEquals("6771011", count.get(CardValue.JACK));
    }

    @Test
    public void shouldReturntheScore() {
        PokerHand handWithGroupsOf2And3 = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'C'),
                new Card(CardValue.TEN, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.SIX, 'S'),
                new Card(CardValue.SEVEN, 'C'),
        });

        Cardssorted counter = new Cardssorted(handWithGroupsOf2And3);
        CardstoString count = counter.getCount();
        assertEquals(23, count.highCard(CardValue.JACK));
    }
}
