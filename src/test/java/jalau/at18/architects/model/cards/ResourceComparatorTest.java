package jalau.at18.architects.model.cards;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ResourceComparatorTest {
    @Test
    public void shouldHaveTheSameResource(){
        GrayCard card1 = new GrayCard(Resource.BRICK);
        GrayCard card2 = new GrayCard(Resource.BRICK);
        ResourceComparator resourceComparator = new ResourceComparator();
        assertTrue(resourceComparator.compare(card1, card2));
    }

    @Test
    public void shouldNotHaveTheSameResource(){
        GrayCard card1 = new GrayCard(Resource.BRICK);
        GrayCard card2 = new GrayCard(Resource.PAPER);
        ResourceComparator resourceComparator = new ResourceComparator();
        assertFalse(resourceComparator.compare(card1, card2));
    }
}
