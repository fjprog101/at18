package jalau.at18.architects.model.cards;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CardComparatorForResourceTest {
    @Test
    public void shouldHaveTheSameResourceDueWildcard(){
        Card card1 = new YellowCard();
        Card card2 = new GrayCard(Resource.PAPER);
        CardComparatorForResource cardComparatorForResource = new CardComparatorForResource();
        assertTrue(cardComparatorForResource.compare(card1, card2));
    }

    @Test
    public void shouldHaveTheSameResourceDueWildcard2(){
        Card card1 = new GrayCard(Resource.PAPER);
        Card card2 = new YellowCard();
        CardComparatorForResource cardComparatorForResource = new CardComparatorForResource();
        assertTrue(cardComparatorForResource.compare(card1, card2));
    }

    @Test
    public void shouldHaveTheSameResourceDueWildcard3(){
        Card card1 = new YellowCard();
        Card card2 = new YellowCard();
        CardComparatorForResource cardComparatorForResource = new CardComparatorForResource();
        assertTrue(cardComparatorForResource.compare(card1, card2));
    }

    @Test
    public void shouldNotHaveTheSameResourceDueWildcard(){
        Card card1 = new GrayCard(Resource.BRICK);
        Card card2 = new GrayCard(Resource.PAPER);
        CardComparatorForResource cardComparatorForResource = new CardComparatorForResource();
        assertFalse(cardComparatorForResource.compare(card1, card2));
    }
    @Test
    public void shouldNotBeTheSameCard(){
        Card card1 = new YellowCard();
        Card card2 = new RedCard(0, MilitarySymbol.PERMANENT);
        CardComparatorForResource cardComparatorForResource = new CardComparatorForResource();
        assertFalse(cardComparatorForResource.compare(card1, card2));

    }
    @Test
    public void shouldNotBeTheSameCard1(){
        Card card1 = new RedCard(0, MilitarySymbol.PERMANENT);
        Card card2 = new YellowCard();
        CardComparatorForResource cardComparatorForResource = new CardComparatorForResource();
        assertFalse(cardComparatorForResource.compare(card1, card2));

    }
}
