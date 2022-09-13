package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardListSortedTest {

    @Test
    public void shouldIncrementCountForExistingCardValue() {
        StringCards stringCards = new StringCards();
        stringCards.add(CardValue.TWO);
        stringCards.add(CardValue.THREE);
        stringCards.add(CardValue.FOUR);
        stringCards.add(CardValue.FIVE);
        stringCards.add(CardValue.QUEEN);

        assertEquals("2 3 4 5 12 ", stringCards.get(CardValue.ACE));
    }

    @Test
    public void shouldReturntheScore() {
        PokerHand handWithGroupsOf2And3 = new PokerHand(new Card[] {
                new Card(CardValue.SEVEN, 'C'),
                new Card(CardValue.TEN, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.SIX, 'S'),
                new Card(CardValue.SEVEN, 'C'),
        });

        SortedCards counter = new SortedCards(handWithGroupsOf2And3);
        StringCards count = counter.getCount();
        assertEquals(37, count.cardDefinitive(CardValue.JACK));
    }
}
